package org.enargit.gwt.springbok.data.bootstrap;


import com.opencsv.CSVReader;
import org.enargit.gwt.springbok.data.entities.Country;
import org.enargit.gwt.springbok.data.entities.Role;
import org.enargit.gwt.springbok.services.impl.CountryServiceImpl;
import org.enargit.gwt.springbok.services.impl.RoleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

@Component
public class BootstrapData implements ApplicationListener<ContextRefreshedEvent> {


    public static final Logger LOGGER = LoggerFactory.getLogger(BootstrapData.class);

    private RoleServiceImpl roleService;

    private CountryServiceImpl countryService;

    public RoleServiceImpl getRoleService() {
        return roleService;
    }

    public CountryServiceImpl getCountryService() {
        return countryService;
    }

    @Autowired
    public void setCountryService(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }

    @Autowired
    public void setRoleService(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadRoles();
        loadCountries();
    }

    private void loadRoles() {

        Role roleUser = new Role();
        roleUser.setRole("ROLE_USER");
        roleUser.setDescription("Common user role");
        roleUser.setCreated(new Date());
        roleUser.setCreatedBy("admin");
        roleService.save(roleUser);

        Role roleAdmin = new Role();
        roleAdmin.setRole("ROLE_ADMIN");
        roleAdmin.setDescription("Administrator role");
        roleAdmin.setCreated(new Date());
        roleAdmin.setCreatedBy("admin");
        roleService.save(roleAdmin);
    }


    private void loadCountries() {

        try (CSVReader reader = new CSVReader(new FileReader(getClass().getResource("/country.csv").getFile()));) {


            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                Country country = new Country();
                country.setName(nextLine[1]);
                country.setDomain(nextLine[2]);
                country.setAbbreviation(nextLine[3]);
                country.setPhone(nextLine[4]);
                countryService.save(country);
            }
        } catch (IOException e) {
            LOGGER.error("Error during import of countries:", e);
        }

    }

}

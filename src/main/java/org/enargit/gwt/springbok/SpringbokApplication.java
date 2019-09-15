package org.enargit.gwt.springbok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringbokApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbokApplication.class, args);
    }

}

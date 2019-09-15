package org.enargit.gwt.springbok.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

public class OffsetLimitRequest implements Pageable, Serializable {

    private int limit;
    private long offset;
    private final Sort sort;


    public OffsetLimitRequest(long offset, int limit, Sort sort) {
        if (offset < 0) {
            throw new IllegalArgumentException("Offset index must not be less than zero!");
        }

        if (limit < 1) {
            throw new IllegalArgumentException("Limit must not be less than one!");
        }
        this.limit = limit;
        this.offset = offset;
        this.sort = sort;
    }

    public OffsetLimitRequest(long offset, int limit, Sort.Direction direction, String... properties) {
        this(offset, limit, new Sort(direction, properties));
    }

    public OffsetLimitRequest(long offset, int limit) {
        this(offset, limit, new Sort(Sort.Direction.ASC, "id"));
    }

    public static OffsetLimitRequest of(long offset, int limit, Sort sort) {

        return new OffsetLimitRequest(offset, limit, sort);
    }

    public static OffsetLimitRequest of(long offset, int limit) {

        return new OffsetLimitRequest(offset, limit, Sort.unsorted());
    }

    public static OffsetLimitRequest of(long offset, int limit, Sort.Direction direction, String... properties) {
        return of(offset, limit, Sort.by(direction, properties));
    }

    @Override
    public int getPageNumber() {
        return Long.valueOf(offset).intValue() / limit;
    }

    @Override
    public int getPageSize() {
        return limit;
    }

    @Override
    public long getOffset() {
        return offset;
    }

    @Override
    public Sort getSort() {
        return sort;
    }

    @Override
    public Pageable next() {
        return new OffsetLimitRequest(getOffset() + getPageSize(), getPageSize(), getSort());
    }

    public OffsetLimitRequest previous() {
        return hasPrevious() ? new OffsetLimitRequest(getOffset() - getPageSize(), getPageSize(), getSort()) : this;
    }


    @Override
    public Pageable previousOrFirst() {
        return hasPrevious() ? previous() : first();
    }

    @Override
    public Pageable first() {
        return new OffsetLimitRequest(0, getPageSize(), getSort());
    }

    @Override
    public boolean hasPrevious() {
        return offset > limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof OffsetLimitRequest)) return false;

        OffsetLimitRequest that = (OffsetLimitRequest) o;

        return new EqualsBuilder()
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(sort, that.sort)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(limit)
                .append(offset)
                .append(sort)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("limit", limit)
                .append("offset", offset)
                .append("sort", sort)
                .toString();
    }
}

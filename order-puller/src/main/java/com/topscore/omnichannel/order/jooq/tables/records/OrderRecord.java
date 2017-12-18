/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq.tables.records;


import com.topscore.omnichannel.order.jooq.tables.Order;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record4<Integer, Boolean, Integer, String> {

    private static final long serialVersionUID = 804797069;

    /**
     * Setter for <code>order.order.number</code>.
     */
    public void setNumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>order.order.number</code>.
     */
    public Integer getNumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>order.order.write_off</code>.
     */
    public void setWriteOff(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>order.order.write_off</code>.
     */
    public Boolean getWriteOff() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>order.order.source_type</code>.
     */
    public void setSourceType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>order.order.source_type</code>.
     */
    public Integer getSourceType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>order.order.member_number</code>.
     */
    public void setMemberNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>order.order.member_number</code>.
     */
    public String getMemberNumber() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Boolean> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Boolean, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Boolean, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Order.ORDER_.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Order.ORDER_.WRITE_OFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Order.ORDER_.SOURCE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Order.ORDER_.MEMBER_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getWriteOff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSourceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMemberNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value1(Integer value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value2(Boolean value) {
        setWriteOff(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value3(Integer value) {
        setSourceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value4(String value) {
        setMemberNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord values(Integer value1, Boolean value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER_);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(Integer number, Boolean writeOff, Integer sourceType, String memberNumber) {
        super(Order.ORDER_);

        set(0, number);
        set(1, writeOff);
        set(2, sourceType);
        set(3, memberNumber);
    }
}

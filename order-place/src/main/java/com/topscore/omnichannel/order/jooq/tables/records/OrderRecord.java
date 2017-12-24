/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq.tables.records;


import com.topscore.omnichannel.order.jooq.tables.Order;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record2<String, Integer> {

    private static final long serialVersionUID = -126633301;

    /**
     * Setter for <code>orderdb.order.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>orderdb.order.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>orderdb.order.type</code>.
     */
    public void setType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>orderdb.order.type</code>.
     */
    public Integer getType() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Order.ORDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Order.ORDER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value2(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord values(String value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(String id, Integer type) {
        super(Order.ORDER);

        set(0, id);
        set(1, type);
    }
}

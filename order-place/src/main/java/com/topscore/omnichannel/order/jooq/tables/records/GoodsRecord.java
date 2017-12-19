/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq.tables.records;


import com.topscore.omnichannel.order.jooq.tables.Goods;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * 商品表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GoodsRecord extends TableRecordImpl<GoodsRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1513121081;

    /**
     * Setter for <code>order.goods.id</code>. 商品编号
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>order.goods.id</code>. 商品编号
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>order.goods.name</code>. 商品名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>order.goods.name</code>. 商品名称
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Goods.GOODS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Goods.GOODS.NAME;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GoodsRecord
     */
    public GoodsRecord() {
        super(Goods.GOODS);
    }

    /**
     * Create a detached, initialised GoodsRecord
     */
    public GoodsRecord(String id, String name) {
        super(Goods.GOODS);

        set(0, id);
        set(1, name);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq.tables;


import com.topscore.omnichannel.order.jooq.Keys;
import com.topscore.omnichannel.order.jooq.Orderdb;
import com.topscore.omnichannel.order.jooq.tables.records.OrderGoodsRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class OrderGoods extends TableImpl<OrderGoodsRecord> {

    private static final long serialVersionUID = -990175039;

    /**
     * The reference instance of <code>orderdb.order_goods</code>
     */
    public static final OrderGoods ORDER_GOODS = new OrderGoods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderGoodsRecord> getRecordType() {
        return OrderGoodsRecord.class;
    }

    /**
     * The column <code>orderdb.order_goods.goods_id</code>.
     */
    public final TableField<OrderGoodsRecord, String> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>orderdb.order_goods.quality</code>.
     */
    public final TableField<OrderGoodsRecord, Integer> QUALITY = createField("quality", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>orderdb.order_goods.unit_price</code>.
     */
    public final TableField<OrderGoodsRecord, BigDecimal> UNIT_PRICE = createField("unit_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 5), this, "");

    /**
     * The column <code>orderdb.order_goods.order_id</code>.
     */
    public final TableField<OrderGoodsRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * Create a <code>orderdb.order_goods</code> table reference
     */
    public OrderGoods() {
        this("order_goods", null);
    }

    /**
     * Create an aliased <code>orderdb.order_goods</code> table reference
     */
    public OrderGoods(String alias) {
        this(alias, ORDER_GOODS);
    }

    private OrderGoods(String alias, Table<OrderGoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderGoods(String alias, Table<OrderGoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Orderdb.ORDERDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderGoodsRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_GOODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderGoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderGoodsRecord>>asList(Keys.KEY_ORDER_GOODS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrderGoodsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderGoodsRecord, ?>>asList(Keys.FK5OTXVRQHYS8TMR8W1YV7X4VJT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoods as(String alias) {
        return new OrderGoods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderGoods rename(String name) {
        return new OrderGoods(name, null);
    }
}

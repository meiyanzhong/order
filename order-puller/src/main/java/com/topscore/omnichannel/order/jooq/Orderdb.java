/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq;


import com.topscore.omnichannel.order.jooq.tables.Department;
import com.topscore.omnichannel.order.jooq.tables.Order;
import com.topscore.omnichannel.order.jooq.tables.OrderGoods;
import com.topscore.omnichannel.order.jooq.tables.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Orderdb extends SchemaImpl {

    private static final long serialVersionUID = -194776676;

    /**
     * The reference instance of <code>orderdb</code>
     */
    public static final Orderdb ORDERDB = new Orderdb();

    /**
     * The table <code>orderdb.department</code>.
     */
    public final Department DEPARTMENT = com.topscore.omnichannel.order.jooq.tables.Department.DEPARTMENT;

    /**
     * The table <code>orderdb.order</code>.
     */
    public final Order ORDER = com.topscore.omnichannel.order.jooq.tables.Order.ORDER;

    /**
     * The table <code>orderdb.order_goods</code>.
     */
    public final OrderGoods ORDER_GOODS = com.topscore.omnichannel.order.jooq.tables.OrderGoods.ORDER_GOODS;

    /**
     * The table <code>orderdb.person</code>.
     */
    public final Person PERSON = com.topscore.omnichannel.order.jooq.tables.Person.PERSON;

    /**
     * No further instances allowed
     */
    private Orderdb() {
        super("orderdb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Department.DEPARTMENT,
            Order.ORDER,
            OrderGoods.ORDER_GOODS,
            Person.PERSON);
    }
}
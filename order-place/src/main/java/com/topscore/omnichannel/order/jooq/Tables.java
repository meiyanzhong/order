/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq;


import com.topscore.omnichannel.order.jooq.tables.Department;
import com.topscore.omnichannel.order.jooq.tables.Order;
import com.topscore.omnichannel.order.jooq.tables.OrderGoods;
import com.topscore.omnichannel.order.jooq.tables.Person;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in orderdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>orderdb.department</code>.
     */
    public static final Department DEPARTMENT = com.topscore.omnichannel.order.jooq.tables.Department.DEPARTMENT;

    /**
     * The table <code>orderdb.order</code>.
     */
    public static final Order ORDER = com.topscore.omnichannel.order.jooq.tables.Order.ORDER;

    /**
     * The table <code>orderdb.order_goods</code>.
     */
    public static final OrderGoods ORDER_GOODS = com.topscore.omnichannel.order.jooq.tables.OrderGoods.ORDER_GOODS;

    /**
     * The table <code>orderdb.person</code>.
     */
    public static final Person PERSON = com.topscore.omnichannel.order.jooq.tables.Person.PERSON;
}

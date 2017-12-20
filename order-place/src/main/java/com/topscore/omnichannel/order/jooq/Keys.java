/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq;


import com.topscore.omnichannel.order.jooq.tables.Databasechangeloglock;
import com.topscore.omnichannel.order.jooq.tables.Order;
import com.topscore.omnichannel.order.jooq.tables.OrderGoods;
import com.topscore.omnichannel.order.jooq.tables.records.DatabasechangeloglockRecord;
import com.topscore.omnichannel.order.jooq.tables.records.OrderGoodsRecord;
import com.topscore.omnichannel.order.jooq.tables.records.OrderRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>order</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = UniqueKeys0.KEY_DATABASECHANGELOGLOCK_PRIMARY;
    public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = UniqueKeys0.KEY_ORDER_PRIMARY;
    public static final UniqueKey<OrderGoodsRecord> KEY_ORDER_GOODS_PRIMARY = UniqueKeys0.KEY_ORDER_GOODS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "KEY_databasechangeloglock_PRIMARY", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
        public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = createUniqueKey(Order.ORDER, "KEY_order_PRIMARY", Order.ORDER.ID);
        public static final UniqueKey<OrderGoodsRecord> KEY_ORDER_GOODS_PRIMARY = createUniqueKey(OrderGoods.ORDER_GOODS, "KEY_order_goods_PRIMARY", OrderGoods.ORDER_GOODS.ORDER_ID, OrderGoods.ORDER_GOODS.GOODS_ID);
    }
}

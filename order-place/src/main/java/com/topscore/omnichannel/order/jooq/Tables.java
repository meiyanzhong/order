/*
 * This file is generated by jOOQ.
*/
package com.topscore.omnichannel.order.jooq;


import com.topscore.omnichannel.order.jooq.tables.Databasechangelog;
import com.topscore.omnichannel.order.jooq.tables.Databasechangeloglock;
import com.topscore.omnichannel.order.jooq.tables.Goods;
import com.topscore.omnichannel.order.jooq.tables.Order;
import com.topscore.omnichannel.order.jooq.tables.OrderGoods;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in order
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
     * The table <code>order.databasechangelog</code>.
     */
    public static final Databasechangelog DATABASECHANGELOG = com.topscore.omnichannel.order.jooq.tables.Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>order.databasechangeloglock</code>.
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = com.topscore.omnichannel.order.jooq.tables.Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * 商品表
     */
    public static final Goods GOODS = com.topscore.omnichannel.order.jooq.tables.Goods.GOODS;

    /**
     * 订单表
     */
    public static final Order ORDER_ = com.topscore.omnichannel.order.jooq.tables.Order.ORDER_;

    /**
     * 订单商品表
     */
    public static final OrderGoods ORDER_GOODS = com.topscore.omnichannel.order.jooq.tables.OrderGoods.ORDER_GOODS;
}

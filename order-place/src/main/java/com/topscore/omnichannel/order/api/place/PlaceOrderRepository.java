package com.topscore.omnichannel.order.api.place;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import static com.topscore.omnichannel.order.jooq.Tables.ORDERS;
import static com.topscore.omnichannel.order.jooq.Tables.ORDER_GOODS;

@Repository
public class PlaceOrderRepository {

    private DSLContext create;

    public Result<Record> findOne(String id) {
        return create.select()
                .from(ORDERS)
                .innerJoin(ORDER_GOODS).on(ORDERS.ID.eq(ORDER_GOODS.ORDER_ID))
                .where(ORDERS.ID.eq(id))
                .orderBy(ORDERS.TYPE)
                .fetch();
    }
}

package com.topscore.omnichannel.order.api.place;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import static com.topscore.omnichannel.order.jooq.Tables.ORDER;
import static com.topscore.omnichannel.order.jooq.Tables.ORDER_GOODS;

@Repository
public class PlaceOrderRepository {

    private DSLContext create;

    public Result<Record> findOne(String id) {
        return create.select()
                .from(ORDER)
                .innerJoin(ORDER_GOODS).on(ORDER.ID.eq(ORDER_GOODS.ORDER_ID))
                .where(ORDER.ID.eq(id))
                .orderBy(ORDER.TYPE)
                .fetch();
    }
}

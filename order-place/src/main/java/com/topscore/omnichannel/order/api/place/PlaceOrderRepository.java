package com.topscore.omnichannel.order.api.place;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import static com.topscore.omnichannel.order.jooq.Tables.ORDER_;
import static com.topscore.omnichannel.order.jooq.Tables.ORDER_GOODS;

@Repository
public class PlaceOrderRepository {

    private DSLContext create;

    public Result<Record> findOne(String id) {
        return create.select()
                .from(ORDER_)
                .innerJoin(ORDER_GOODS).on(ORDER_.ID.eq(ORDER_GOODS.ORDER_ID))
                .where(ORDER_.ID.eq(id))
                .orderBy(ORDER_.TYPE)
                .fetch();
    }
}

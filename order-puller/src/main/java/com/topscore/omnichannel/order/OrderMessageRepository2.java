package com.topscore.omnichannel.order;

import com.topscore.omnichannel.order.jooq.tables.records.OrderMessageRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.topscore.omnichannel.order.jooq.tables.OrderMessage.ORDER_MESSAGE;

@Repository
public class OrderMessageRepository2 {

    @Autowired
    private DSLContext create;

    public Result<OrderMessageRecord> findAll() {
        return create.selectFrom(ORDER_MESSAGE)
//                .where(ORDER_MESSAGE.ID.eq("10036803661690112"))
                .orderBy(ORDER_MESSAGE.ID).fetch();
    }
}

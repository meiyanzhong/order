package com.topscore.omnichannel.order.config;

import org.jinq.jooq.JinqJooqContext;
import org.jooq.DSLContext;
import org.jooq.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jinqs {

    private static DSLContext context;

    public static JinqJooqContext getJinq(Schema schema) {
        return JinqJooqContext.using(context, schema);
    }

    @Autowired
    public void setContext(DSLContext context) {
        Jinqs.context = context;
    }
}

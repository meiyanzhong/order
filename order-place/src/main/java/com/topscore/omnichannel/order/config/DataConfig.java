package com.topscore.omnichannel.order.config;

import org.jinq.jooq.JinqJooqContext;
import org.jinq.jpa.JinqJPAStreamProvider;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import static com.topscore.omnichannel.order.jooq.Orderdb.ORDERDB;

@Configuration
public class DataConfig {

    @PersistenceUnit
    private EntityManagerFactory emf;

    private final DSLContext context;

    @Autowired
    public DataConfig(DSLContext context) {
        this.context = context;
    }

    @Bean
    public JinqJPAStreamProvider streams() {
        return new JinqJPAStreamProvider(emf);
    }

    @Bean
    public JinqJooqContext jinq() {
        return JinqJooqContext.using(context, ORDERDB);
    }
}

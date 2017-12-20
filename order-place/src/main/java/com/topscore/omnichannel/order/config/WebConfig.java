package com.topscore.omnichannel.order.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.undertow.UndertowOptions.ENABLE_HTTP2;

@Configuration
public class WebConfig {

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
        factory.addBuilderCustomizers(builder -> builder.setServerOption(ENABLE_HTTP2, true));
        return factory;
    }
}

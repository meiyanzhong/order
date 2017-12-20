package com.topscore.omnichannel.order.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
public class OrderGoods {

    @EmbeddedId
    private Id id;

    private Integer quality;

    private BigDecimal unitPrice;

    @Data
    @Embeddable
    public static class Id implements Serializable {
        private static final long serialVersionUID = 6153076599311335972L;
        /**
         * 订单编号。
         */
        @Column(length = 30)
        private String orderId;
        /**
         * 商品编号。
         */
        @Column(length = 30)
        private String goodsId;
    }
}

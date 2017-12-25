package com.topscore.omnichannel.order.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Entity
public class OrderGoods {
    @Id
    @Column(length = 30)
    private String goodsId;

    @Column(length = 3)
    private int quality;

    @Column(precision = 10, scale = 5)
    private BigDecimal unitPrice;

    @ManyToOne
    private Order order;
}

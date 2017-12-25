package com.topscore.omnichannel.order.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="NUM")
    private String number;
    private String type;
}

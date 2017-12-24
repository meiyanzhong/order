package com.topscore.omnichannel.order.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    private Department department;

    public Person(String name) {
        this.name = name;
    }
}

package com.topscore.omnichannel.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "`order`")
public class Order {

    /**
     * 订单号。
     */
    @Id
    @Column(length = 30)
    private String id;
    /**
     * 订单类型。
     */
    @Convert(converter = Type.Converter.class)
    private Type type;

//    @OneToMany
//    private Collection<OrderGoods> goods;

    @AllArgsConstructor
    public enum Type {
        STORE(0, "门店"),
        TMALL(1, "天猫"),
        TAOBAO(2, "淘宝"),
        JD(3, "京东"),
        VIP(4, "京东");

        @Getter
        private Integer value;
        @Getter
        private String name;

        public static Type valueOf(Integer value) {
            for (Type t : Type.values()) {
                if (t.value.equals(value)) {
                    return t;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return name;
        }

        @javax.persistence.Converter
        public static class Converter implements AttributeConverter<Type, Integer> {

            @Override
            public Integer convertToDatabaseColumn(Type attribute) {
                return attribute.getValue();
            }

            @Override
            public Type convertToEntityAttribute(Integer dbData) {
                return Type.valueOf(dbData);
            }
        }
    }
}

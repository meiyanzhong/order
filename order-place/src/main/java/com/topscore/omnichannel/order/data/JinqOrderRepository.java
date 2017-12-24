package com.topscore.omnichannel.order.data;

import com.topscore.omnichannel.order.model.Order;
import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JinqOrderRepository {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private JinqJPAStreamProvider streams;

    public List<Order> findAll() {
//        return streams.streamAll(em, Order.class).toList();
//        Jinqs.getJinq(ORDER);

        return null;
    }
}

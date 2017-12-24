package com.topscore.omnichannel.order.data;

import com.topscore.omnichannel.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}

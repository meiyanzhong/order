package com.topscore.omnichannel.order.data;

import com.topscore.omnichannel.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, String> {
}

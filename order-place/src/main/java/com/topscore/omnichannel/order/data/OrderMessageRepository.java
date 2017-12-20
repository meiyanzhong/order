package com.topscore.omnichannel.order.data;

import com.topscore.omnichannel.order.model.OrderGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMessageRepository extends JpaRepository<OrderGoods, OrderGoods.Id> {
}

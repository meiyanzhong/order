package com.topscore.omnichannel.order.domain;

import com.topscore.omnichannel.order.api.place.PlaceOrderController;

public interface OrderOperations {

    String create(PlaceOrderController.OrderForm form);

    void update();

    void delete();


}

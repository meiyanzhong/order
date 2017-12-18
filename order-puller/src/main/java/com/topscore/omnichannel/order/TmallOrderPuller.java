package com.topscore.omnichannel.order;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 天猫订单拉取器。
 */
public class TmallOrderPuller extends AbstractOrderPuller<List> {

    @Override
    public List pull(LocalDateTime begin, LocalDateTime end) {
        return null;
    }
}

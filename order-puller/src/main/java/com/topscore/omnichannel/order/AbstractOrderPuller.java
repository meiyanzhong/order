package com.topscore.omnichannel.order;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * 订单拉取器。
 *
 * @param <E> 拉取的订单结果类型
 */
@Slf4j
@Data
public abstract class AbstractOrderPuller<E> {

    /**
     * 下单的下限。
     */
    protected LocalDateTime begin;
    /**
     * 下单时间的上限。
     */
    protected LocalDateTime end;



    /**
     * 拉取订单信息 -> 存储 -> 发送MQ。
     *
     * @param begin 开始时间
     * @param end   结束时间
     */
    public void dispose(LocalDateTime begin, LocalDateTime end) {
        // 1.拉取订单
        E messages = pull(begin, end);

        // 2.存储报文
        save(messages);

        // 3.发送报文
        send(messages);
    }

    /**
     * 拉取订单数据。
     *
     * @param begin 开始时间
     * @param end   结束时间
     * @return 订单
     */
    protected abstract E pull(LocalDateTime begin, LocalDateTime end);

    /**
     * 存储订单原始报文。
     *
     * @param messages 报文信息
     * @return 被存储的数量
     */
    protected int save(E messages) {
        return 0;
    }

    /**
     * 发送订单报文至MQ。
     *
     * @param messages 报文信息
     * @return 已被发送至MQ的报文数量
     */
    protected int send(E messages) {
        return 0;
    }
}

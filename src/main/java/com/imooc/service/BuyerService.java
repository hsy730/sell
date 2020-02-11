package com.imooc.service;

import com.imooc.datatransferobject.OrderDTO;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-30 16:30
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);
}

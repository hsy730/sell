package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.datatransferobject.OrderDTO;
import com.imooc.enums.OrderStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 21:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderService;
    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("小黄");
        orderDTO.setBuyerAddress("长城路");
        orderDTO.setBuyerPhone("18945631256");
        orderDTO.setBuyerOpenid("123456");
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("123456");
        orderDetail1.setProductQuantity(1);
        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("12315");
        orderDetail2.setProductQuantity(2);
        orderDetailList.add(orderDetail1);
        orderDetailList.add(orderDetail2);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderService.create(orderDTO);
        System.out.println("结果："+result);
        assertNotNull(result);
    }

    @Test
    public void findOne() {
        String orderId = "1580134149048559493";
        OrderDTO orderDTO = orderService.findOne(orderId);
        System.out.println("结果:"+orderDTO);
        assertEquals(orderId, orderDTO.getOrderId());
    }

    @Test
    public void list() {
        Page<OrderDTO> orderDTOPage = orderService.findList("123456", PageRequest.of(0, 2));
        assertNotEquals(0, orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() {
        String orderId = "1580134149048559493";
        OrderDTO orderDTO = orderService.findOne(orderId);
        OrderDTO result = orderService.cancel(orderDTO);
        assertEquals(OrderStatusEnum.CANCEL.getCode(), result.getOrderStatus());
    }

    @Test
    public void finish() {
        String orderId = "1580134149048559493";
        OrderDTO orderDTO = orderService.findOne(orderId);
        OrderDTO result = orderService.finish(orderDTO);
        assertEquals(OrderStatusEnum.FINISH.getCode(), result.getOrderStatus());
    }

    @Test
    public void paid() {
    }
}
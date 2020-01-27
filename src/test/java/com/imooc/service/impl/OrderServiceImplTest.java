package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.datatransferobject.OrderDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
    }

    @Test
    public void list() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}
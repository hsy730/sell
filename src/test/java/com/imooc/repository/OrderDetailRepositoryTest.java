package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-26 23:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1254556");
        orderDetail.setOrderId("589515");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("88481");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.5));
        orderDetail.setProductQuantity(5);
        OrderDetail result = repository.save(orderDetail);
        assertEquals("1254556", result.getDetailId());
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("589515");
        assertNotEquals(0, orderDetailList.size());
    }
}
package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.Instant;

import static org.junit.Assert.*;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-26 12:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("abc123");
        orderMaster.setBuyerName("小黄斯基");
        orderMaster.setBuyerPhone("12886452369");
        orderMaster.setBuyerAddress("长城路");
        orderMaster.setBuyerOpenid("125694");
        orderMaster.setOrderAmount(new BigDecimal(23.2));
        OrderMaster result = repository.save(orderMaster);
        assertEquals("abc123", result.getOrderId());
//        assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = PageRequest.of(0, 1);
        Page<OrderMaster> result = repository.findByBuyerOpenid("125694", request);
//        System.out.println(request.getPageNumber());
        System.out.println(result.getTotalElements());
        assertNotNull(result);
    }
}
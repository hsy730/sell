package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.datatransferobject.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-28 11:46
 */
public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(OrderMaster2OrderDTOConverter::convert).collect(Collectors.toList());
    }
}

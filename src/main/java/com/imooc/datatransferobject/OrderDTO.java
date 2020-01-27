package com.imooc.datatransferobject;

import com.imooc.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 仅用于在各层之间传输，与数据库对象区分开，
 * 每个orderDTO对象包含一个orderDetail容器
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 16:20
 */
@Data
public class OrderDTO {
    /**订单id*/
    private String orderId;
    /**买家名字*/
    private String buyerName;
    /**买家手机号*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;
    /**买家微信openid*/
    private String buyerOpenid;
    /**订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态，默认为 0 新订单*/
    private Integer orderStatus;
    /**支付状态，默认为 0 未支付*/
    private Integer payStatus;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    /**订单详情列表*/
    private List<OrderDetail> orderDetailList;
}

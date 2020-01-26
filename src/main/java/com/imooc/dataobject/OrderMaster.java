package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-26 11:00
 */
@Data
@Entity
@DynamicUpdate
public class OrderMaster {
    /**订单id*/
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /**支付状态，默认为 0 未支付*/
    private Integer payStatus = PayStatusEnum.UNPAID.getCode();
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
}

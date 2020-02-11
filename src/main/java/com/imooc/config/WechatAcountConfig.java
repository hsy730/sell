package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 微信账号配置
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-02-02 14:47
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAcountConfig {

    private String mpAppId;
    private String mpAppSecret;
}

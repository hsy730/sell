package com.imooc.VO;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-24 0:03
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**具体内容*/
    private T data;
}

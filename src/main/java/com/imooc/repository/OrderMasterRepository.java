package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-26 12:02
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
    /**传入pageable才能实现分页查询*/
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}

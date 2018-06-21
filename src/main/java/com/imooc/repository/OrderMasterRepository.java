package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/11
 * Time: 上午12:03
 * Description: No Description
 */


public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{
    Page<OrderMaster> findAllByBuyerOpenid(String buyerOpenid, Pageable pageable);
}

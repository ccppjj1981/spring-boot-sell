package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/11
 * Time: 上午6:28
 * Description: No Description
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String>{
    List<OrderDetail> findByOrderId(String orderId);

}
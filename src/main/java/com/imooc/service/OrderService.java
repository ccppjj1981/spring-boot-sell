package com.imooc.service;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/12
 * Time: 上午6:22
 * Description: No Description
 */
public interface OrderService {
    /**创建订单
     *
     */
    OrderDto create(OrderDto orderDto);
    OrderDto findOne(String orderId);
    Page<OrderDto> findList(String buyerOpenid, Pageable pageable);
    OrderDto cancel(OrderDto orderDto);
    OrderDto finish(OrderDto orderDto);
    OrderDto paid(OrderDto orderDto);
}

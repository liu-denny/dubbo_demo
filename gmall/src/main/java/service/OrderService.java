package service;

import entity.UserAddress;

import java.util.List;

/**
 * @author yudong
 * @create 2019-08-19 15:54
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}

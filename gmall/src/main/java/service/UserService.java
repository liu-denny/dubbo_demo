package service;

import entity.UserAddress;

import java.util.List;

/**
 * @author yudong
 * @create 2019-08-19 15:55
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}

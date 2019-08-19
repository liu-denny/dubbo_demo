package service.impl;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * @author yudong
 * @create 2019-08-19 16:33
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for(UserAddress userAddress:addressList){
            System.out.println(userAddress.getUserAddress());
        }

    }
}

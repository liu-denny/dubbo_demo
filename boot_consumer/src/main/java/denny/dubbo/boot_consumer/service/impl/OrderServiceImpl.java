package denny.dubbo.boot_consumer.service.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yudong
 * @create 2019-08-19 16:33
 */
@Service
public class OrderServiceImpl implements OrderService {

//    @Resource
    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}

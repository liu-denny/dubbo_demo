import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;

/**
 * @author yudong
 * @create 2019-08-19 16:40
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();
    }
}

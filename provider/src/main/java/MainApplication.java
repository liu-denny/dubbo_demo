import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yudong
 * @create 2019-08-19 16:05
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.in.read();
    }
}

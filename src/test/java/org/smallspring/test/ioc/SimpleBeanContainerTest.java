package org.smallspring.test.ioc;

import org.junit.Test;
import org.smallspring.beans.factory.BeanFactory;

/**
 * @author 黄凯强
 * @version 1.0
 * @date 2023/4/5 15:49
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }

    class HelloService {
        public void sayHello() {
            System.out.println("hello");
        }
    }
}

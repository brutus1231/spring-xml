package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Message message1 = context.getBean("message1", Message.class);
        System.out.println(message1.getText());

    }
}

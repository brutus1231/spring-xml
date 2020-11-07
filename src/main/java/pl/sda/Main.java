package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Message message1 = context.getBean("message1", Message.class);
        System.out.println(message1.getText());

        Message message2 = context.getBean("message1", Message.class);
        System.out.println(message2.getText());
        System.out.println(message1 == message2);


        ExtraMessage extraMessage1 = context.getBean("message2", ExtraMessage.class);
        System.out.println(extraMessage1.getText());

        ExtraMessage extraMessage2 = context.getBean("message2", ExtraMessage.class);
        System.out.println(extraMessage2.getText());
        System.out.println(extraMessage1 == extraMessage2);
    }
}

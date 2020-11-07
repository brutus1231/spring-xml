package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Student student = context.getBean(Student.class);
        System.out.println(student.getFirstName());

    }
}

package person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationPerson.xml");
        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        person.perform();
        person.getAllFlats();

        person2.perform();
        person2.getAllFlats();


    }


}

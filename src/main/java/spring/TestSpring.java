package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //With help this ClassPath Spring read aplicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicatioContext.xml");
        TestBean ob = context.getBean("testBean", TestBean.class);
        System.out.println(ob.getName());
        context.close();

    }
}

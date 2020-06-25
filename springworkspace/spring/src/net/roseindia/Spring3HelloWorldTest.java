package net.roseindia;

import java.util.Map;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

public class Spring3HelloWorldTest 
    {
    public static void main(String[] args)
    {
    XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("SpringHelloWorld.xml"));
     
    Spring3HelloWorld myBean1=(Spring3HelloWorld)beanFactory.getBean("spring3HelloWorldBean1");
     System.out.println(myBean1.sayHello());
     Spring3HelloWorld myBean2=(Spring3HelloWorld)beanFactory.getBean("spring3HelloWorldBean2");
     System.out.println(myBean2.sayHello());
    
     
     }
}       


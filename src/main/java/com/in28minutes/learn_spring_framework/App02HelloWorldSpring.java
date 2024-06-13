package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Step 1: Launch a spring context using the configuration class
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //Step 2: Configure the things that we want Spring to manage - using @Configuration Class (Beans) to launch a spring context
        //We created the HelloWorldConfiguration Class with @Configuration
        //with a name() method with @Bean

        //Step 3: Retrieving the bean managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        //Different person details bean methods
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("personByBeanMethodCall"));
        System.out.println(context.getBean("personByParameter"));
        //referred using custom name for the bean, not the actual method name
        System.out.println(context.getBean("address2"));
        //Commented as we are going to use Address.class in next statement
        //System.out.println(context.getBean("address3"));
        System.out.println(context.getBean(Address.class));
    }
}

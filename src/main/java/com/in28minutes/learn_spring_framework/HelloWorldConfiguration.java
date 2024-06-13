package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean; //indicates that a method produces a bean to be managed by a Spring Container
import org.springframework.context.annotation.Configuration; //indicates that the class would have @bean methods to be implemented

//Record helps in creating the constructor of a separately undefined class
//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor, setters, getters
//equals, hashcode and toString are automatically created.
//Released in JDK 16.
record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Aravind";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        var person = new Person("Kishore", 30, new Address("1180 Reed Ave", "San Jose"));
        //Test Printing the values called using getters of record
        //System.out.println(person.name());
        //System.out.println(person.age());
        return person;
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("2054 N Beverly plaza", "Long Beach");
    }

    //We are referring Address.class in the Main method, so only one method returning Address is allowed
//    @Bean
//    public Address address3() {
//        return new Address("1180 Reed Ave", "San Jose");
//    }

    //Calling existing beans within another bean
    @Bean
    public Person personByBeanMethodCall() {
        return new Person(name(),age(), address());
    }

    //passing the beans as parameters
    //Note: for sudonames of beans, while passing as parameters use sudonames and while calling the method use the method name
    //A way of auto-wiring/injecting the beans
    @Bean
    public Person personByParameter(String name, int age, Address address2) {//Beans: name, age and address2 passed as parameters, names should match correctly
        return new Person(name,age, address2);
    }
}


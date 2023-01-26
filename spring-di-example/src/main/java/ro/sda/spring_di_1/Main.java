package ro.sda.spring_di_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_1.beans.Cat;
import ro.sda.spring_di_1.components.Cow;
import ro.sda.spring_di_1.components.Dog;
import ro.sda.spring_di_1.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        // application context is just a "map" which is initialized at the start-up of the app and
        // this map holds every component that is managed by spring (@Bean, @Component, @Service, @Controller, @Repository)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat c1 = context.getBean(Cat.class);
        c1.sayMeow();

        Dog d1 = context.getBean(Dog.class);
        d1.sayHam();

        Cow c2 = context.getBean(Cow.class);
        c2.sayMu();
    }
}

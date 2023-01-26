package ro.sda.spring_di_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_4.beans.Cat;
import ro.sda.spring_di_4.beans.Owner;
import ro.sda.spring_di_4.configuration.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Cat c1 = context.getBean(Cat.class);
            System.out.println(c1);

            System.out.println("---------------------");

            Cat c2 = context.getBean(Cat.class);
            System.out.println(c2);
            System.out.println("---------------------");

            Owner o = context.getBean(Owner.class);
            Cat c3 = o.getCat();

            System.out.println(o);
            System.out.println(c3);

            System.out.println("App is finishing!");
        }
    }
}

package ro.sda.spring_di_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_1.beans.Cat;
import ro.sda.spring_di_1.components.Cow;
import ro.sda.spring_di_1.components.Dog;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring_di_1.components")
public class ProjectConfig {
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Cow cow() {
        return new Cow();
    }
}

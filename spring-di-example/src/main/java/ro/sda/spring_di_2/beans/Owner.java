package ro.sda.spring_di_2.beans;

import org.springframework.beans.factory.annotation.Autowired;


public class Owner {
    private String name;

    // @Autowired
    // it has to be a bean to be injected
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void walkWithTheDog() {
        System.out.println("Owner " + name + " took his dog " + dog.getName() + " out for a walk!");
    }
}

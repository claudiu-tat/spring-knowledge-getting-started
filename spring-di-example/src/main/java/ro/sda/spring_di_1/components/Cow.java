package ro.sda.spring_di_1.components;

import org.springframework.stereotype.Component;

@Component
public class Cow {
    public void sayMu(){
        System.out.println("Muuu!");
    }
}

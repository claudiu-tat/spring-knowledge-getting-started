package ro.sda.aop_example_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.aop_example_1.config.ProjectConfig;
import ro.sda.aop_example_1.services.MathService;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            MathService service = context.getBean(MathService.class);

            service.add(1,2);
            service.subtract(5,2);
            service.divide(9,4);


            try {
                service.add(2,2);
            } catch (RuntimeException e) {

            }

            try {
                service.divide(2, 2);
            } catch (RuntimeException e) {

            }
        }
    }
}

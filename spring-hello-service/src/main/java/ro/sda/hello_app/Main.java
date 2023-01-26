package ro.sda.hello_app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.hello_app.config.ProjectConfig;
import ro.sda.hello_app.services.HelloService;


public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService service = context.getBean(HelloService.class);
            service.sayHello();
        }
    }
}

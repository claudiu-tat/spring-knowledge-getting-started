package ro.sda.hello_app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ro.sda.hello_app.services.impl")
public class ProjectConfig {
}

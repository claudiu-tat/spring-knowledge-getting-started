package ro.sda.first_rest_app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ro.sda.first_rest_app.model.Person;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/simple-hello")        // name of the endpoint
    public String hello() {
        log.info("Request received: /simple-hello");
        return "Hello";
    }

    //path param
    @GetMapping("/hello/{name}")
    public String  helloPathParam(@PathVariable("name") String name) {
        log.info("Request received: /hello/{name}");
        return "Hello " + name + "!";
    }

    @PostMapping("/create-person")
    public String createPerson(@RequestBody Person person) {
        log.info(person.toString());
        return "PERSON RECEIVED";
    }


    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable int id){
        log.warn("Request received: /person/{id} with id: " + id);
        log.warn("Request received: /person/{id}");
        return new Person("Claudiu", 28);
    }

    @GetMapping("/other-person")
    public Person getOtherPerson(@RequestParam("identifier") String identifier){
        log.error("Request received: /other-person with identifier: " + identifier);
        return new Person("Messi", 35);
    }
}

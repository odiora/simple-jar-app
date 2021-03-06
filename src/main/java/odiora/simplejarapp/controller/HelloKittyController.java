package odiora.simplejarapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKittyController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello: " + name;
    }

}

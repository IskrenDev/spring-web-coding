package de.ir.springwebcoding;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello world!";
    }

    @PostMapping("/hello/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public String greetMe(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}


package de.ir.springwebcoding;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    List<Message> messageList = new ArrayList<>();


    @PostMapping("/messages")
    @ResponseStatus(HttpStatus.CREATED)
    public String giveMeMessage(@RequestParam String name, String message, String id)
    {
        System.out.println(messageList.add(new Message(name, message, id)));
        return "Hello, " + name +  " " + message + " " + id + ".";
    }

}


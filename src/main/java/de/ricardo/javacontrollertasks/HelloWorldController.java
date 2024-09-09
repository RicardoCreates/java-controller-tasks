package de.ricardo.javacontrollertasks;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World Task!";
    }

    @GetMapping("/hello/{name}")
    public String helloSomeone(@PathVariable String name) {
        return "Hello, " + name + "!";
    }


}

package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    @RequestMapping(value = "/controllers")
    public Greeting greeting(){
        Greeting greeting = new Greeting(1, "Hello world");
        return greeting;
    }
}

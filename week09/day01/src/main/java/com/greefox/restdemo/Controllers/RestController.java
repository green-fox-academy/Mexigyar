package com.greefox.restdemo.Controllers;

import com.greefox.restdemo.Models.Appendable;
import com.greefox.restdemo.Models.Doubling;
import com.greefox.restdemo.Models.Error;
import com.greefox.restdemo.Models.Greater;

import com.greefox.restdemo.Models.DoUntil;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new Error("{\n" +
                    "  \"error\": \"Csicska vagy!\"\n" +
                    "}");
        }
    }

    @GetMapping(value = "/greater")
    public Object greeter(@RequestParam String name, @RequestParam String title) {
        if (name != null && title != null) {
            return new Greater(name, title).toString();
        } else {
            return "{\n" +
                    "  \"error\": \"Please provide a name!\"\n" +
                    "}";
        }
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Object appendable(@PathVariable (value = "appendable")String word){
        return new Appendable(word);
    }

    @PostMapping(value = "/dountil/{what}")
    public Object doUntil(@PathVariable (value = "what")String task,@RequestParam int number){
        return new DoUntil(task, number).getResult();
    }
}


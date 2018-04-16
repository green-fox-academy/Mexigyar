package com.greefox.restdemo.Controllers;

import com.greefox.restdemo.Models.Appendable;
import com.greefox.restdemo.Models.Doubling;
import com.greefox.restdemo.Models.Greater;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam Integer input) {
        if (input != null) {
            return new Doubling(input).toString();
        } else {
            return "{\n" +
                    "  \"error\": \"Csicska vagy!\"\n" +
                    "}";
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
    public Object appendable(@PathVariable String appendable){
        return new Appendable(appendable + "a").toString();
    }

}


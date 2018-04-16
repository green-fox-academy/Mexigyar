package com.greefox.restdemo.Controllers;

import com.greefox.restdemo.Models.Doubling;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam Integer input) {
        if (input instanceof Integer)  {
            return new Doubling(input);
        } else {
            return "{\n" +
                    "  \"error\": \"Csicska vagy!\"\n" +
                    "}";
        }
    }
}

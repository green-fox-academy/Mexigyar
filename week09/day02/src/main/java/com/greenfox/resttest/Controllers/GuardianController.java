package com.greenfox.resttest.Controllers;

import com.greenfox.resttest.Model.Guardian;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value = "/groot")
    public Object imgroot(@RequestParam(value = "message", required=false)String somemessage){
        return new Guardian(somemessage);
    }
}

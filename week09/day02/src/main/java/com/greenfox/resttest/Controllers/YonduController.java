package com.greenfox.resttest.Controllers;

import com.greenfox.resttest.Model.Errormsg;
import com.greenfox.resttest.Model.Yondu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

    @GetMapping("/yondu")
    public Object yondu(@RequestParam(value = "distance", required = false) Integer distance, @RequestParam(value = "time", required = false) Integer time) {
        if (distance != null && time != null) {
            return new Yondu(distance, time);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errormsg("ERROR"));
        }
    }
}
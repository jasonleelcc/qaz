package com.qaz.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by innofin-04 on 2016/10/24.
 */
@RestController
public class MyController {
    @RequestMapping("/")
    String home(){return "AP is Running";}

    @RequestMapping("/test")
    String test(){return "test  ";}

    @RequestMapping(value="test/{id}", method= RequestMethod.GET)
    String testId(@PathVariable("id") String id){
        return "test "+id;
    }
}

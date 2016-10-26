package com.qaz.controller;

import com.qaz.dao.signInDao;
import com.qaz.entity.Signine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.qaz.param.*;

/**
 * Created by innofin-04 on 2016/10/24.
 */

@RestController
public class MyController {
    @Autowired
    private signInDao signInDao;


    @RequestMapping("/")
    String home(){return "AP is Running";}

    @RequestMapping("/test")
    String test(){return "test  ";}

    @RequestMapping(value="test/{id}", method= RequestMethod.GET)
    String testId(@PathVariable("id") String id){
        return "test "+id;
    }

    @RequestMapping(value="signin", method= RequestMethod.POST)
    public void signIn(@RequestBody @Autowired signInParam signinP){
        System.out.println(signinP.getId());
        System.out.println(signinP.getUserid());
        System.out.println(signinP.getPasswd());
        Signine a = new Signine();
        a.setId("A123456789");
        a.setPasswd("123456");
        a.setUserId("jason");

       signInDao.save(a);

    }

}

package com.jmonsinjon.devfest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jmonsinjon on 15/10/16.
 */
@Controller
@RequestMapping("/")
public class WhoamiController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String sayHello() throws Exception {
        return "Hello I'm Jeremie in v1";
        //throw new Exception("Error");
        //return "Hello I'm Jeremie in v1";
    }
}

package com.mkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model1.addAttribute("greeting", "Hello World from");
        return "welcome";
    }
 
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again");
        return "welcome";
    }
 
}
package com.ruchira.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ruchira on 6/13/2020.
 */
@Controller
@RequestMapping(value = "base")
public class HomeController {

    @RequestMapping(value = "project",method = RequestMethod.GET)
    @ResponseBody
    public String getProjectDefinition(){
        return "Dispather servlet driven/Spring mvc base controller output";
    }

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String getHomePage(){
        return "home";
    }
}

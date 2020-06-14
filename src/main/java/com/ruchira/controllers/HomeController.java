package com.ruchira.controllers;

import com.ruchira.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public String getHomePage(Model model){//here we have bind spring model with view and add required attributes,data to the model object
        Employee em1=new Employee(1,"John Doe");
        model.addAttribute("employee1",em1);
        return "home";
    }

    @RequestMapping(value = "about",method = RequestMethod.GET)
    public ModelAndView getAboutMePage(){
        //Here we use spring "ModelAndView" class to directly add (model and view) together and return
        ModelAndView modelAndView=new ModelAndView("about");
        Employee em2=new Employee(2,"Smith Doe");
        modelAndView.addObject("employee2",em2);

        return modelAndView;
    }
}

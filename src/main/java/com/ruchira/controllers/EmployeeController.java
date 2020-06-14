package com.ruchira.controllers;

import com.ruchira.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Ruchira on 6/14/2020.
 */
@Controller
@RequestMapping(value = "employee")
public class EmployeeController {

    @RequestMapping(value = "{empId}",method = RequestMethod.GET)
    public String getEmployeeDetails(Model model,@PathVariable("empId") int employeeId){

        Employee em1=new Employee(1,"John Doe");
        Employee em2=new Employee(2,"Smith Doe");

        if (employeeId==1){
            model.addAttribute("employee",em1);
        }else if (employeeId==2){
            model.addAttribute("employee",em2);
        }else {
            model.addAttribute("employee",em1);
        }
        return "employee/details";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String getEmployeesByName(Model model,@RequestParam("empName") String name){

        Employee em1=new Employee(1,"John Doe");
        Employee em2=new Employee(2,"Smith Doe");

        if (name.equals(em1.getName())){
            model.addAttribute("employee",em1);
        }else if (name.equals(em2.getName())){
            model.addAttribute("employee",em2);
        }else {
            model.addAttribute("employee",em1);
        }
        return "employee/list";
    }
}

package com.vacation.a.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vacation.a.Model.Registrationusers;
import com.vacation.a.Service.RegistrationserviceIMLP;





@Controller
public class Firstcon {

    @Autowired
     RegistrationserviceIMLP service;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }
  
    @PostMapping("/registration")
    public String register(@ModelAttribute Registrationusers a) {
        service.addUser(a);
        System.out.println(a);
        System.out.println("User Registration");
        return "index";
    }

    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable int id, Model model) {
        Registrationusers users = service.getUserByid(id);
        System.out.println(users);
        return "index";
    }
}

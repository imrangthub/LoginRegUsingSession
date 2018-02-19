package com.imran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.imran.model.User;

@Controller
public class TestController {
	
//   @GetMapping("/")
//   public String index() {
//      return "index";
//   }

   
   @GetMapping("/test")
   public String test(@SessionAttribute("user") User user) {
	   
	      System.out.println("From test controller Email: " + user.getEmail());
	      System.out.println("From test controller First Name: " + user.getFname());
	      
	      
      return "test";
   }


}

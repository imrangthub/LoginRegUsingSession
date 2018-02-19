package com.imran.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.imran.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

   /*
    * Get user from session attribute
    */
//   @GetMapping("/info")
//   public String userInfo(@SessionAttribute("user") User user) {
//
//      System.out.println("Email: " + user.getEmail());
//      System.out.println("First Name: " + user.getFname());
//
//      return "user";
//   }
   

   @GetMapping("/info")
   public String userInfo(HttpSession session) {
	   
	   User user = (User)session.getAttribute("user");
      return "user";
   }
   
   
   
//   @GetMapping("/logout")
//   public String logout(HttpSession session ) {
//      session.invalidate();
////      request.session.destroy();
//      return "redirect:/login";
//   }
}
package com.imran.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.SessionAttribute;
import com.imran.model.User;

@Controller
public class LoginController {
   /*
    * Add user in model attribute
    */
   @ModelAttribute("user")
   public User setUpUser() {
      return new User();
   }

   @GetMapping("/login")
   public String index() { 	   
      return "login";
   }

   @PostMapping("/dologin")
   public String doLogin(HttpSession session, @ModelAttribute("user") User user, Model model) {

      // Implement your business logic
      if (user.getEmail().equals("imranmadbar@gmail.com") && user.getPassword().equals("12345")) {
         // Set user dummy data
         user.setFname("MD IMRAN");
         user.setMname("HOSSAIN");
         user.setLname("BABU");
         user.setAge(28);
         
         session.setAttribute("user", user);
         
      } else {
         model.addAttribute("message", "Login failed. Try again.");
         return "login";
      }
      return "redirect:/user/info";
   }
   
   @GetMapping("/logout")
   public String logout(HttpSession session ) {
      session.invalidate();
      return "redirect:/login";
   }
   


   
}

package com.imran.common;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.imran.model.User;

@Component
public class BaseServicer {
	
   public User getCurrentUserInfo( HttpSession session){
	   User user = (User)session.getAttribute("user");
	   if(user !=null){
			  System.out.println("From Base Service Email from Session: " + user.getEmail());
			  System.out.println("From Base Service Name Session: " + user.getFname());
	   }
	  return user;
   }


}

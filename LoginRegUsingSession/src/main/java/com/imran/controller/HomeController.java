package com.imran.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.imran.common.BaseServicer;

@Controller
public class HomeController {
	
	@Autowired
	BaseServicer baseServicer;
	
	  @GetMapping("/")
	   public String index(HttpSession session) { 
		  baseServicer.getCurrentUserInfo(session);
	      return "index";
	   }

}

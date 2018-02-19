package com.imran.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.imran.common.BaseServicer;

public class UserInterceptor extends BaseServicer implements HandlerInterceptor{

   // Called before handler method invocation

   public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
         Object handler) throws Exception {
      System.out.println("From UserInterceptor: Called before handler method");
      req.setAttribute("fname", "Elizabeth");
      return true;
   }

   // Called after handler method request completion, before rendering the view

   public void postHandle(HttpServletRequest req, HttpServletResponse res, 
         Object handler, ModelAndView model)  throws Exception {
      System.out.println(" From UserInterceptor: Called after handler method request completion,"
            + " before rendering the view");

      model.addObject("lname", "Brown");
   }

   // Called after rendering the view

   public void afterCompletion(HttpServletRequest req, HttpServletResponse res,
         Object handler, Exception ex)  throws Exception {
      System.out.println("From UserInterceptor: Called after rendering the view");
   }
}
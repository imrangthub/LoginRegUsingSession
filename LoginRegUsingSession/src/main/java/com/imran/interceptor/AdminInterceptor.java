package com.imran.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.imran.common.BaseServicer;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	BaseServicer baseServicer = new BaseServicer();

	// Called before handler method invocation
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		if (baseServicer.getCurrentUserInfo(req.getSession()) == null) {
			res.sendRedirect(req.getContextPath() + "/login");
			return false;
		}
		return true;
	}

}

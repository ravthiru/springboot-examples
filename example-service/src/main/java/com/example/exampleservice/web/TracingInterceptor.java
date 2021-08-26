package com.example.exampleservice.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

public class TracingInterceptor implements HandlerInterceptor {
	
	private static final String LOGLEVEL = "set-log-level";
	

	@Override
	public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler)
			throws Exception {

		MDC.clear();
		MDC.put(LOGLEVEL, getLogLevelFromRequest(request));
		return true;
	}

	private String getLogLevelFromRequest(HttpServletRequest request) {
		String incomingLogLevel = request.getHeader(LOGLEVEL);
		return incomingLogLevel == null || incomingLogLevel.isBlank() ? "INFO" : incomingLogLevel;
	}
}


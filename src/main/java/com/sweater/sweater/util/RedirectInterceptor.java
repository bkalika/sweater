package com.sweater.sweater.util;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author @bkalika
 * Created on 11.08.2022 11:34 PM
 */
public class RedirectInterceptor implements HandlerInterceptor {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if(modelAndView != null) {
            String args = request.getQueryString() != null ? request.getQueryString() : "";
            String url = request.getRequestURI().toString() + "?" + args;
            response.setHeader("Turbolinks-Location", url);
        }
    }
}

package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap) {
        modelMap.addAttribute("message", "Welcome to Rieltor-helper");
        return "index";
    }

    @RequestMapping(value = "/logout")
    public void logOut(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        HttpSession session = httpServletRequest.getSession(false);
        session.setAttribute("inSystem", false);
        session.setAttribute("currentUserName", null);
        try {
            httpServletResponse.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

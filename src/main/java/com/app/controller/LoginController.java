package com.app.controller;

import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {

    private ApplicationContext applicationContext;
    private UserDao userDao;

    @RequestMapping (value = "/signIn", method = RequestMethod.GET)
    public ModelAndView getForm(){
        return new ModelAndView("signIn");
    }

    @RequestMapping (value = "/signInUser", method = RequestMethod.POST)
    public ModelAndView signIn(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                               @ModelAttribute ("user") User user){
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        userDao = (UserDao) applicationContext.getBean("userDao");
        User user1 = userDao.find(user.getLogin());
        if (user1 == null || !user.getPassword().equals(user1.getPassword())){
            return new ModelAndView("signIn");
        }else {
            HttpSession session = httpServletRequest.getSession(true);
            session.setAttribute("inSystem",true);
            session.setAttribute("currentUserName",user1.getLogin());
            try {
                httpServletResponse.sendRedirect("/");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}

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

@Controller
@RequestMapping (value = "/signUp")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getForm(){
        return new ModelAndView("signUp");
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public ModelAndView signUp (@ModelAttribute("user") User user){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.create(user.getLogin(),user.getPassword());
        return new ModelAndView("/index");
    }
}

package com.app.controller;

import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping
public class RegisterController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView getForm() {
        return new ModelAndView("signup");
    }

    @RequestMapping(value = "/registeruser", method = RequestMethod.POST)
    public void signUp(@ModelAttribute("user") User user, HttpServletResponse httpServletResponse) {
        userDao.create(user.getLogin(), user.getPassword());
        try {
            httpServletResponse.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

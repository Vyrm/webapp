package com.app.controller;

import com.app.dao.ApartmentDao;
import com.app.dao.UserDao;
import com.app.model.Apartment;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class ApartmentController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private ApartmentDao apartmentDao;

    @RequestMapping("/addapartment")
    public ModelAndView getForm() {
        return new ModelAndView("addapartment");
    }

    @RequestMapping("/addnewapartment")
    public void addApartment(@ModelAttribute("apartment") Apartment apartment, HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse) {
        HttpSession httpSession = httpServletRequest.getSession();
        String currentUser = (String) httpSession.getAttribute("currentUserName");
        User user = userDao.find(currentUser);
        Apartment apartment1 = new Apartment(user, apartment.getCity(), apartment.getStreet(),
                apartment.getRoomCount(), apartment.getPrice());
        apartmentDao.create(apartment1);
        userDao.update(user, apartment);

        try {
            httpServletResponse.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/showapartments")
    public String showApartments(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        String currentUser = (String) httpSession.getAttribute("currentUserName");
        User user = userDao.find(currentUser);
        httpServletRequest.setAttribute("list", user.getApartmentsList());
        return "showaddedapartments";
    }
}

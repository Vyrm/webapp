package com.app.controller;

import com.app.model.Apartment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping(method = RequestMethod.GET)
    public String showAllApartments(HttpServletRequest httpServletRequest) {
        TypedQuery<Apartment> typedQuery = entityManager.createQuery("SELECT a FROM Apartment a", Apartment.class);
        List<Apartment> list = typedQuery.getResultList();
        httpServletRequest.setAttribute("list", list);
        return "index";
    }
    @RequestMapping()
    public String printWelcome(ModelMap modelMap) {
        modelMap.addAttribute("message", "Welcome to Rieltor-helper");
        return "index";
    }


}

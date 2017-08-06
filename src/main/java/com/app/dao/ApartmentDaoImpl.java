package com.app.dao;

import com.app.model.Apartment;
import com.app.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ApartmentDaoImpl implements ApartmentDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Apartment create(User owner, String city, String street, int roomCount, int price) {
        Apartment apartment = new Apartment(owner,city,street,roomCount,price);
        entityManager.persist(owner.getApartmentsList().add(apartment));
        return apartment;
    }
}

package com.app.dao;

import com.app.model.Apartment;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ApartmentDaoImpl implements ApartmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(Apartment apartment) {
        entityManager.persist(apartment);
    }
}

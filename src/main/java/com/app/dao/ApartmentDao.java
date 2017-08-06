package com.app.dao;

import com.app.model.Apartment;
import com.app.model.User;

public interface ApartmentDao {
    Apartment create(User owner, String city, String street, int roomCount, int price);
}

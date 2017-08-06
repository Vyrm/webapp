package com.app.model;


import javax.persistence.*;

@Entity
@Table(name = "apartments")
public class Apartment extends AutoGeneratedId{
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User owner;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private int roomCount;
    @Column
    private int price;

    public Apartment(User owner, String city, String street, int roomCount, int price) {
        this.owner = owner;
        this.city = city;
        this.street = street;
        this.roomCount = roomCount;
        this.price = price;
    }

    public Apartment() {
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){

    }

    @Override
    public String toString() {
        return "Apartment{" +
                "owner=" + owner +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", roomCount=" + roomCount +
                ", price=" + price +
                '}';
    }
}

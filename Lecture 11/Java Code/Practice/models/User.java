package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    UUID id;
    String name;
    String address;
    List<Order> orderList= new ArrayList<>();
    Cart cart = new Cart();

    public User(String userName,String userAddress){
        this.id = UUID.randomUUID();
        this.name  = userName;
        this.address = userAddress;
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public Cart getCart() {
        return cart;
    }

    public UUID getId(){
        return id;
    }
}
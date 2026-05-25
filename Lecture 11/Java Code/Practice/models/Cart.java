package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    Restaurant restaurant=null;
    List<MenuItem> itemList = new ArrayList<>();
    Double totalPrice=0D;
    public Cart(){
    }

    public List<MenuItem> getItemList() {
        return itemList;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }
}
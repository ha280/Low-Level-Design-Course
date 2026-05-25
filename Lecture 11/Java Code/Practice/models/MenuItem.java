package models;

import java.util.UUID;

public class MenuItem {
    private UUID code;
    private String name;
    private double price;

    public MenuItem(String itemName, double cost){
        code = UUID.randomUUID();
        name = itemName;
        price=cost;
    }

    public UUID getCode() {
        return code;
    }

    public void setCode(UUID c) {
        code = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }
}
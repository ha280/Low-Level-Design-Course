package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private UUID id;
    private String name;
    private List<MenuItem> menu = new ArrayList<>();
    private String location;
    public Restaurant(String ResName, String address){
        this.name = ResName;
        this.location=address;
        this.id = UUID.randomUUID();
    }
    public void addMenuItem(MenuItem item){
        menu.add(item);
    }
    public List<MenuItem> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String loc) {
        location = loc;
    }


}
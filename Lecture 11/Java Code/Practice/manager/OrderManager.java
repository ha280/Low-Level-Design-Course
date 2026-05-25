package manager;

import models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderManager {
    static List<Order> orderList = new ArrayList<>();
    private static OrderManager instance = null;

    private OrderManager(){

    }

    public static OrderManager getInstance(){
        if(instance==null){
            instance = new OrderManager();
        }
        return instance;
    }

    public static void addOrder(Order o){
        orderList.add(o);
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public List<Order> getOrderByUserId(UUID userId){
        List<Order> list = new ArrayList<>();
        for(Order o: orderList){
            if(o.getUser().getId() == userId){
                list.add(o);
            }
        }
        return list;
    }
}
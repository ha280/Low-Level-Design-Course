package models;

import strategies.PaymentStrategy;
import Enum.PaymentStatusEnum;
import Enum.OrderType;
import java.util.List;

public class DelivaryOrder extends Order {
    static String delivaryAddress;

    public DelivaryOrder(Restaurant res, Double price, User u, List<MenuItem> items, PaymentStatusEnum payment, PaymentStrategy ps, String address) {
        super(res, price, u, items, payment, ps);
        delivaryAddress = address;
    }
public OrderType getType(){
        return OrderType.DELIVARY;
}
}
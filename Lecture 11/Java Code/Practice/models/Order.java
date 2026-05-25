package models;

import strategies.PaymentStrategy;
import Enum.OrderStatus;
import Enum.OrderType;
import Enum.PaymentStatusEnum;
import java.util.List;
import java.util.UUID;

public abstract class Order {
    static Restaurant restaurant;
    static List<MenuItem> orderItems;
    static Double totalPrice;
    static User user;
    static PaymentStatusEnum paymentStatus;
    static OrderStatus orderStatus;
    static PaymentStrategy paymentStrategy;
    UUID orderId;
    public Order(Restaurant res, Double price, User u, List<MenuItem> items, PaymentStatusEnum payment, PaymentStrategy ps){
        restaurant = res;
        totalPrice=price;
        user=u;
        orderItems=items;
        paymentStatus = payment;
        paymentStrategy = ps;
        orderStatus = OrderStatus.PREPARING;
        orderId = UUID.randomUUID();
    }

    public User getUser() {
        return user;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public abstract OrderType getType();

    public static List<MenuItem> getItems() {
        return orderItems;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public static OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public static Restaurant getRestaurant() {
        return restaurant;
    }

    public static PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public static PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }
}
package Factory;

import models.*;
import strategies.PaymentStrategy;
import Enum.OrderType;
import Enum.PaymentStatusEnum;


import java.util.List;

public class OrderFactory {
    public Order createOrder(User user, Cart cart, Restaurant restaurant,PaymentStatusEnum status,
                             PaymentStrategy paymentStrategy, OrderType orderType) {
        Order order = null;

        if (orderType == OrderType.DELIVARY) {
            DelivaryOrder deliveryOrder = new DelivaryOrder(restaurant, cart.getTotalPrice(), user,  cart.getItemList(), status , paymentStrategy, user.getAddress());
            order = deliveryOrder;
        }
        return order;
    }
}
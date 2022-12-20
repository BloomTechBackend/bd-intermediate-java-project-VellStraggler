package com.amazon.ata.deliveringonourpromise.types;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    private final String orderId = "900-3746401-0000002";

    @Test
    public void Order_OrderDate_NotModifiable(){
        //GIVEN
        ZonedDateTime orderDate = ZonedDateTime.now();
        Order order = Order.builder()
                .withOrderDate(orderDate)
                .build();
        //WHEN
        ZonedDateTime newOrderDate = order.getOrderDate();
        newOrderDate = newOrderDate.plusHours(1);

        //THEN
        Assertions.assertEquals(order.getOrderDate(),orderDate);
    }
    @Test
    public void GetCustomerOrderItemList_CustomerOrderItemList_NotModifiable(){
        //GIVEN
        OrderItem orderItem = OrderItem.builder()
                .withCustomerOrderItemId("0")
                .build();
        List<OrderItem> orderItemList = new ArrayList<>();
        orderItemList.add(orderItem);
        Order order = Order.builder()
                .withCustomerOrderItemList(orderItemList)
                .build();
        //WHEN
        List<OrderItem> newOrderItemList = order.getCustomerOrderItemList();
        OrderItem orderItem2 = OrderItem.builder()
                .withCustomerOrderItemId("1")
                .build();
        newOrderItemList.add(orderItem2);
        //THEN
        Assertions.assertEquals(order.getCustomerOrderItemList().size(),1,"CustomerOrderItemList should not be modifiable");
    }
    @Test
    public void WithCustomerOrderItemList_CustomerOrderItemList_NotModifiable(){
        //GIVEN
        OrderItem orderItem = OrderItem.builder()
                .withCustomerOrderItemId("0")
                .build();
        List<OrderItem> orderItemList = new ArrayList<>();
        orderItemList.add(orderItem);
        Order order = Order.builder()
                .withCustomerOrderItemList(orderItemList)
                .build();
        //WHEN
        OrderItem orderItem2 = OrderItem.builder()
                .withCustomerOrderItemId("1")
                .build();
        orderItemList.add(orderItem2);
        //THEN
        Assertions.assertEquals(order.getCustomerOrderItemList().size(),1,"CustomerOrderItemList should not be modifiable");
    }
}

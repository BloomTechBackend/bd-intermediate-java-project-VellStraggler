package com.amazon.ata.deliveringonourpromise.dao;

import com.amazon.ata.deliveringonourpromise.types.Order;
import org.junit.jupiter.api.Test;

public class OrderDaoTest {

    private OrderDao dao;
    private final String anOrderId = "900-3746401-0000001";
    /** Given
     * An order ID that we know exists
     * When
     * 1. We call `get()` with that order ID
     * Then
     * The result is not null */
    @Test
    public void get_forKnownOrderId_returnsOrder() {
        Order order = Order.builder()
                .withOrderId(anOrderId)
                .build();
        Order testOrder = dao.get(anOrderId);
        assert testOrder != null;
    }
}

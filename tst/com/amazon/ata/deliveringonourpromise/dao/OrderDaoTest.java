package com.amazon.ata.deliveringonourpromise.dao;

import com.amazon.ata.deliveringonourpromise.App;
import com.amazon.ata.deliveringonourpromise.types.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrderDaoTest {

    private OrderDao dao;
    private final String anOrderId = "900-3746401-0000002";
    /** Given
     * An order ID that we know exists
     * When
     * 1. We call `get()` with that order ID
     * Then
     * The result is not null */
    @Test
    public void get_forKnownOrderId_returnsOrder() {
        dao = new OrderDao(App.getOrderManipulationAuthorityClient());

        Order testOrder;
        testOrder = dao.get(anOrderId);
        assertNotNull(testOrder);
    }
}

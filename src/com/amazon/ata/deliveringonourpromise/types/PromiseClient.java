package com.amazon.ata.deliveringonourpromise.types;

public interface PromiseClient {
    /**
     * All promiseClients need this method, which returns a promise.
     * @param customerOrderItemId an ID specific to an item from an Order.
     * @return a Promise based upon the item ID given.
     */
    Promise getPromiseByOrderItemId(String customerOrderItemId);
}

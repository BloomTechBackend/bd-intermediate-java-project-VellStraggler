package com.amazon.ata.deliveringonourpromise.comparators;
import com.amazon.ata.deliveringonourpromise.types.OrderItem;
import com.amazon.ata.deliveringonourpromise.types.Promise;

import java.util.Comparator;

public class PromiseAsinComparator implements Comparator<Promise> {
    public PromiseAsinComparator() {
    }
    /**
     * This compare function looks at the ASINs of two items for comparison.
     * @param itemA the first object to be compared.
     * @param itemB the second object to be compared.
     * @return an integer representing the comparison
     */
    @Override
    public int compare(Promise promiseA, Promise promiseB) {
        return promiseA.getAsin().compareTo(promiseB.getAsin());
    }
}

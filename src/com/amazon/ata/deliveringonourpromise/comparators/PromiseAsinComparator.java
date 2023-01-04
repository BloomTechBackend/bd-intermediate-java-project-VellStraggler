package com.amazon.ata.deliveringonourpromise.comparators;
import com.amazon.ata.deliveringonourpromise.types.Promise;

import java.util.Comparator;

public class PromiseAsinComparator implements Comparator<Promise> {
    /**
     * Made simply for instantiating this comparator child class.
     * Does nothing.
     */
    public PromiseAsinComparator() {
    }
    /**
     * This compare function looks at the ASINs of two items for comparison.
     * @param promiseA the first object to be compared.
     * @param promiseB the second object to be compared.
     * @return an integer representing the comparison
     */
    @Override
    public int compare(Promise promiseA, Promise promiseB) {
        return promiseA.getAsin().compareTo(promiseB.getAsin());
    }
}

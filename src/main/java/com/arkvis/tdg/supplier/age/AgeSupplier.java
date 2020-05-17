package com.arkvis.tdg.supplier.age;

import com.arkvis.tdg.supplier.IntegerSupplier;

import java.util.Random;

public class AgeSupplier implements IntegerSupplier {

    private static final int DEFAULT_LOWER_BOUND = 0;
    private static final int DEFAULT_UPPER_BOUND = 121;

    private Random random;
    private int lowerBound;
    private int upperBound;

    /**
     * Creates an age supplier that produces ages within 0 and 120 (inclusive)
     */
    public AgeSupplier() {
        this(DEFAULT_LOWER_BOUND, DEFAULT_UPPER_BOUND);
    }

    /**
     * Creates an age supplier that produces ages between the lower bound (inclusive) and upper bound (exclusive)
     */
    public AgeSupplier(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        random = new Random();
    }

    @Override
    public Integer get() {
        return lowerBound + random.nextInt(upperBound - lowerBound);
    }
}

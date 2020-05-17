package com.arkvis.tdg.supplier;

import com.arkvis.tdg.supplier.age.AgeSupplier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AgeSupplierTest {

    @Test
    public void should_returnAge_when_supplying() {
        Integer age = new AgeSupplier().get();
        assertNotNull(age);
    }

    @Test
    public void should_returnAgeWithinRange_when_supplying() {
        int lowerBound = 10;
        int upperBound = 11;
        
        int age = new AgeSupplier(lowerBound, upperBound).get();
        assertEquals(lowerBound, age);
    }
}

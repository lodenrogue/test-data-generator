package com.arkvis.tdg.supplier;

import com.arkvis.tdg.supplier.address.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AddressSupplierTest {

    @Test
    public void should_returnAddressLine1_when_supplying() {
        String addressLine1 = new AddressLine1Supplier().get();
        assertNotNull(addressLine1);
    }

    @Test
    public void should_returnAddressLine2_when_supplying() {
        String addressLine2 = new AddressLine2Supplier().get();
        assertNotNull(addressLine2);
    }

    @Test
    public void should_returnCity_when_supplying() {
        String city = new CitySupplier().get();
        assertNotNull(city);
    }

    @Test
    public void should_returnCountry_when_supplying() {
        String country = new CountrySupplier().get();
        assertNotNull(country);
    }

    @Test
    public void should_returnPostalCode_when_supplying() {
        String postalCode = new PostalCodeSupplier().get();
        assertNotNull(postalCode);
    }
}

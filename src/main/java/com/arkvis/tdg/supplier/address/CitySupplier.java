package com.arkvis.tdg.supplier.address;

import com.arkvis.tdg.supplier.FakerUtil;
import com.arkvis.tdg.supplier.StringSupplier;

public class CitySupplier implements StringSupplier {

    @Override
    public String get() {
        return FakerUtil.getInstance().address().city();
    }
}

package com.arkvis.tdg.supplier.name;

import com.arkvis.tdg.supplier.FakerUtil;
import com.arkvis.tdg.supplier.StringSupplier;

public class FirstNameSupplier implements StringSupplier {

    @Override
    public String get() {
        return FakerUtil.getInstance().name().firstName();
    }
}

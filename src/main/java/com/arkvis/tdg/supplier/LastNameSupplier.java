package com.arkvis.tdg.supplier;

public class LastNameSupplier implements StringSupplier {

    @Override
    public String get() {
        return FakerUtil.getInstance().name().lastName();
    }
}

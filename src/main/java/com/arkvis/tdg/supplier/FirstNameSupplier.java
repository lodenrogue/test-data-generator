package com.arkvis.tdg.supplier;

public class FirstNameSupplier implements StringSupplier {

    @Override
    public String get() {
        return FakerUtil.getInstance().name().firstName();
    }
}

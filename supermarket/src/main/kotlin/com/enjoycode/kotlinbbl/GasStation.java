package com.enjoycode.kotlinbbl;

public class GasStation {

    private final GasPrice gasPrice;

    public GasStation(GasPrice gasPrice) {
        this.gasPrice = gasPrice;
    }

    public GasPrice getGasPrice() {
        return gasPrice;
    }
}

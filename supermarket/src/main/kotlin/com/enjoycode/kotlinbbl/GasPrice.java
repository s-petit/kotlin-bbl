package com.enjoycode.kotlinbbl;

public class GasPrice {

    private final Double pricePerLiter;
    private final Double purchasedLiters;

    public GasPrice(Double pricePerLiter, Double purchasedLiters) {
        this.pricePerLiter = pricePerLiter;
        this.purchasedLiters = purchasedLiters;
    }

    public Double totalSales() {
        return pricePerLiter * purchasedLiters;
    }
}

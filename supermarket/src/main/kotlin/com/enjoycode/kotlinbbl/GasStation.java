package com.enjoycode.kotlinbbl;

public class GasStation {

    private final GasPrice gasPrice;

    public GasStation(GasPrice gasPrice) {
        this.gasPrice = gasPrice;
    }

    public GasPrice getGasPrice() {
        return gasPrice;
    }

    public static class GasPrice {

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
}

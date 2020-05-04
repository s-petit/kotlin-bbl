package com.enjoycode.kotlinbbl;

public class Stock {

    private final Article article;
    private final int stock;

    public Stock(Article article, int stock) {
        this.article = article;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}

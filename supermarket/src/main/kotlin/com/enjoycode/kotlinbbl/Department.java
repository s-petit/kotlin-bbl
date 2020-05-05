package com.enjoycode.kotlinbbl;

import java.util.List;

public class Department {

    private final List<Stock> stocks;
    private final DepartmentType type;
    private final Integer sales;

    public Department(List<Stock> stocks, DepartmentType type, Integer sales) {
        this.stocks = stocks;
        this.type = type;
        this.sales = sales;
    }

    public Integer getSales() {
        return sales;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public DepartmentType getType() {
        return type;
    }

    public static class Stock {

        private final Article article;
        private final int quantity;

        public Stock(Article article, int quantity) {
            this.article = article;
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public Article getArticle() {
            return article;
        }
    }
}

package com.enjoycode.kotlinbbl;

import java.util.List;

public class Department {

    private final List<Stock> stocks;
    private final DepartmentType department;
    private final Integer sales;

    public Department(List<Stock> stocks, DepartmentType department, Integer sales) {
        this.stocks = stocks;
        this.department = department;
        this.sales = sales;
    }

    public Integer getSales() {
        return sales;
    }

    public List<Stock> getStocks() {
        return stocks;
    }
}

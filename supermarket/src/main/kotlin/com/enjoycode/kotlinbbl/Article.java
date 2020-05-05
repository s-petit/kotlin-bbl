package com.enjoycode.kotlinbbl;

import com.enjoycode.kotlinbbl.documentation.Demonstration;

import java.util.Objects;

@Demonstration(why = "data class")
public class Article {

    private static final Double VAT_RATE = 0.2;

    private final String name;
    private final Double price;

    public Article(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double vatPrice() {
        return price * VAT_RATE;
    }

    public Double netPrice() {
        return vatPrice() + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article that = (Article) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Article(" +
                "name=" + name +
                ", price=" + price +
                ')';
    }

    public Article copy() {
        return new Article(name, price);
    }
}

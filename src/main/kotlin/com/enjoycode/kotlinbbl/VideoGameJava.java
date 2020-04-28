package com.enjoycode.kotlinbbl;

import java.util.Objects;

public class VideoGameJava {

    private static final Double VAT_RATE = 0.2;

    private final String name;
    private final String type;
    private final Double price;

    public VideoGameJava(String name, String type, Double price) {
        this.name = name;
        this.type = type;
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
        VideoGameJava that = (VideoGameJava) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(type, that.type) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price);
    }

    @Override
    public String toString() {
        return "VideoGameJava(" +
                "name=" + name +
                ", type=" + type +
                ", price=" + price +
                ')';
    }

    public VideoGameJava copy() {
        return new VideoGameJava(name, type, price);
    }
}

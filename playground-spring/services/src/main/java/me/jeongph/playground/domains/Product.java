package me.jeongph.playground.domains;

public class Product {

    private final Money price;

    public Product(Money price) {
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }

}

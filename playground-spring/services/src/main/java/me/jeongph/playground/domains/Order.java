package me.jeongph.playground.domains;

public class Order {

    private final Product product;
    private final People orderer;

    public Order(Product product, People orderer) {
        this.product = product;
        this.orderer = orderer;
    }

    public Product getProduct() {
        return product;
    }

    public People getOrderer() {
        return orderer;
    }

}

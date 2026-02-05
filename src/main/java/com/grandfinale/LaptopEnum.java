package com.grandfinale;

public enum LaptopEnum {
    MackBook(2000),
    XPS(1000),
    Surface,
    ThinkPad(50);

    private int price;

    LaptopEnum(int price) {
        this.price = price;
        System.out.println("IN laptop");
    }

    LaptopEnum() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

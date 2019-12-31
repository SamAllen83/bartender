package com.bevbot.bartender.api.restaurant;

public class MenuItem {
    private String item;

    private int price;

    public void setItem(String item){
        this.item = item;
    }
    public String getItem(){
        return this.item;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}

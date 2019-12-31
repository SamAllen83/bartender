package com.bevbot.bartender.api.restaurant;

import java.util.List;

public class Restaurant {
    private String id;

    private String name;

    private String priceRange;

    private String imageSrc;

    private String imageDescription;

    private String description;

    private List<MenuItem> menu;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPriceRange(String priceRange){
        this.priceRange = priceRange;
    }
    public String getPriceRange(){
        return this.priceRange;
    }
    public void setImageSrc(String imageSrc){
        this.imageSrc = imageSrc;
    }
    public String getImageSrc(){
        return this.imageSrc;
    }
    public void setImageDescription(String imageDescription){
        this.imageDescription = imageDescription;
    }
    public String getImageDescription(){
        return this.imageDescription;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setMenu(List<MenuItem> menuItems){
        this.menu = menuItems;
    }
    public List<MenuItem> getMenu(){
        return this.menu;
    }
}

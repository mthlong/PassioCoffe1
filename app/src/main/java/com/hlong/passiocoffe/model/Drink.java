package com.hlong.passiocoffe.model;

public class Drink {
    private String drinkName;
    private Long price;
    private Integer urlImage;

    public Drink(String drinkName, Long price, Integer urlImage) {
        this.drinkName = drinkName;
        this.price = price;
        this.urlImage = urlImage;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(Integer urlImage) {
        this.urlImage = urlImage;
    }
}

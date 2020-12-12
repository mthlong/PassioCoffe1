package com.hlong.passiocoffe.model;

public class News {
    private String Title;
    private String Description;
    private Integer imageUrl;

    public News(String title, String description, Integer imageUrl) {
        Title = title;
        Description = description;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}

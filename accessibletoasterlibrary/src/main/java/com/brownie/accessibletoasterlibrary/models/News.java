package com.brownie.accessibletoasterlibrary.models;

public class News {

    private String newsTitle, newsDescription;

    public News(String newsTitle, String newsDescription) {
        this.newsTitle = newsTitle;
        this.newsDescription = newsDescription;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsTitle='" + newsTitle + '\'' +
                ", newsDescription='" + newsDescription + '\'' +
                '}';
    }
}

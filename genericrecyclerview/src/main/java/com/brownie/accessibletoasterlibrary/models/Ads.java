package com.brownie.accessibletoasterlibrary.models;

public class Ads {

    private String adDesc;
    private int adImageResource;

    public Ads(String adDesc, int adImageResource) {
        this.adDesc = adDesc;
        this.adImageResource = adImageResource;
    }

    public String getAdDesc() {
        return adDesc;
    }

    public void setAdDesc(String adDesc) {
        this.adDesc = adDesc;
    }

    public int getAdImageResource() {
        return adImageResource;
    }

    public void setAdImageResource(int adImageResource) {
        this.adImageResource = adImageResource;
    }

    @Override
    public String toString() {
        return "Ads{" +
                "adDesc='" + adDesc + '\'' +
                ", adImageResource=" + adImageResource +
                '}';
    }
}

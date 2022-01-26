package com.brownie.accessibletoasterlibrary.models;

public class Place {

    private String placeName;
    private String placeDescription;
    private int placeImageResource;

    public Place(String placeName, String placeDescription, int placeImageResource) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeImageResource = placeImageResource;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public int getPlaceImageResource() {
        return placeImageResource;
    }

    public void setPlaceImageResource(int placeImageResource) {
        this.placeImageResource = placeImageResource;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeName='" + placeName + '\'' +
                ", placeDescription='" + placeDescription + '\'' +
                ", placeImageResource=" + placeImageResource +
                '}';
    }
}

package com.brownie.accessibletoasterlibrary.models;

public class Food {

    private String foodName, foodDescription;

    private int foodImageResource;

    public Food(String foodName, String foodDescription, int foodImageResource) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodImageResource = foodImageResource;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodImageResource() {
        return foodImageResource;
    }

    public void setFoodImageResource(int foodImageResource) {
        this.foodImageResource = foodImageResource;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodDescription='" + foodDescription + '\'' +
                ", foodImageResource=" + foodImageResource +
                '}';
    }
}

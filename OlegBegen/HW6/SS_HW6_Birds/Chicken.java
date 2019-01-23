package com.company;

public class Chicken extends NonFlyingBird {

    public final String Type_Bird = "Chicken";

    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public Chicken() {
    }


    @Override
    public String getFly() {
        return Type_Bird + ", " + getFeathers() + ", " + getLayEggs() + ", " + super.getFly();
    }
}

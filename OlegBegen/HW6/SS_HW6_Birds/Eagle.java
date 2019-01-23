package com.company;

public class Eagle extends FlyingBird {

public final String Type_Bird = "Eagle";

    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public Eagle() {
    }


    @Override
    public String getFly() {
        return Type_Bird + ", " + getFeathers() + ", " + getLayEggs() + ", " + super.getFly();
    }
}

package com.company;

public class Swallow extends FlyingBird {

    public final String Type_Bird = "Swallow";

    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public Swallow() {
    }


    @Override
    public String getFly() {
        return Type_Bird + ", " + getFeathers() + ", " + getLayEggs() + ", " + super.getFly() ;
    }
}

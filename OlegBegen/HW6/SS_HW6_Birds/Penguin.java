package com.company;

public class Penguin extends NonFlyingBird {

    public final String Type_Bird = "Penguine";

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public Penguin() {
    }


    @Override
    public String getFly() {
        return Type_Bird + ", " + getFeathers() + ", " + getLayEggs() + ", " + super.getFly();
    }
}

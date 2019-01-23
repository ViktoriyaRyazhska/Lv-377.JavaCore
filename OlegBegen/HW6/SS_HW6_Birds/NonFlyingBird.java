package com.company;

public abstract class NonFlyingBird extends Bird {


    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public NonFlyingBird() {
    }

    @Override
    public String getFly() {
        return " Non Fly";
    }
}

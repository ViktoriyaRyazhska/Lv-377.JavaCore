package com.company;

public abstract class FlyingBird extends Bird {


    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public FlyingBird() {
    }

    @Override
    public String getFly() {
        return " Fly";
    }
}

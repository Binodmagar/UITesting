package com.binod.uitesting;



public class UITesting {

    private  float f;
    private  float s;


    public UITesting(float f, float s) {
        this.f = f;
        this.s = s;
    }

    public UITesting() {
    }

    public float add(float f, float s){
        return  f + s;
    }
    public float sub(float f, float s){
        return  f - s;
    } public float div(float f, float s){
        return  f/s;
    }

}

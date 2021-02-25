package com.abdelghani;

import java.util.ArrayList;

public class Car {
    int pd ;
    ArrayList<String> streets = new ArrayList<String>();
    int rest ;

    public Car(int pd, ArrayList<String> streets, int rest) {
        this.pd = pd;
        this.streets = streets;
        this.rest = rest;
    }

}

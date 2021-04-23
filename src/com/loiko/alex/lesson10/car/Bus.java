package com.loiko.alex.lesson10.car;

/**
 * @author Alexey Loiko
 * @project study-2
 */
public class Bus extends Car {

    public Bus(String mark, String model, int year, int fuelVol, int maxSpeed, String color) {
        super(mark, model, year, fuelVol, maxSpeed, color);
    }

    @Override
    public String route() {
        return "едет по загородной трассе";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
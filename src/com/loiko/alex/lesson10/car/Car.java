package com.loiko.alex.lesson10.car;

import java.util.Map;

/**
 * @author Alexey Loiko
 * @project study-2
 */
public abstract class Car {

    private String mark;
    private String model;
    private int year;
    private int fuelVol;
    private int maxSpeed;
    private String color;
    private int quantity;

    public Car(String mark, String model, int year, int fuelVol, int maxSpeed, String color) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.fuelVol = fuelVol;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public abstract String route();

    @Override
    public String toString() {
        return this.color + " " + this.mark + " " + this.model + " " + this.year + " года с объёмом топливного бака " +
                this.fuelVol + " литров может развить максимальную скорость " + this.maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFuelVol() {
        return fuelVol;
    }

    public void setFuelVol(int fuelVol) {
        this.fuelVol = fuelVol;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity(Map<Car, Integer> garage, Sportcar secondSportcar) {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
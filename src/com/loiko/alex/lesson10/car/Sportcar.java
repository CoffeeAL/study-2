package com.loiko.alex.lesson10.car;

/**
 * @author Alexey Loiko
 * @project study-2
 */
public class Sportcar extends Car {

    public Sportcar(String mark, String model, int year, int fuelVol, int maxSpeed, String color) {
        super(mark, model, year, fuelVol, maxSpeed, color);
    }

    @Override
    public String route() {
        return "едет по треку";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
        {
            return false;
        }
        if (o == this)
        {
            return true;
        }
        if (getClass() != o.getClass())
        {
            return false;
        }
        Sportcar e = (Sportcar) o;
        return (this.getMark() == e.getMark());
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
package com.loiko.alex.lesson11.nofreetimeexception;

/**
 * @author Alexey Loiko
 * @project study-2
 */
public class Person {

    private String name;
    private boolean hasFreeTime;

    public Person(String name, boolean hasFreeTime) {
        this.name = name;
        this.hasFreeTime = hasFreeTime;
    }

    public void goSwimming() {
            try {
                if(hasFreeTime == true) {
                    System.out.println(name + " идёт плавать");
                } else {
                    System.out.print("У " + this.name + " ");
                    throw new NoFreeTimeException();
                }
            } catch (NoFreeTimeException e) {
                e.printStackTrace();
            }
        }

    public String getName() {
        return name;
    }

    public boolean isHasFreeTime() {
        return hasFreeTime;
    }
}
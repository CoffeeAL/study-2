package com.loiko.alex.lesson09.student;

/**
 * @author Alexey Loiko
 * @project study-2
 */
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double rate;

    public Student(String firstName, String lastName, int age, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getRate() {
        return rate;
    }
}
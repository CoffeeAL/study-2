package com.loiko.alex.lesson11;

/**
 * @author Alexey Loiko
 * @project study-2
 */

/**
 * Написать код, который создаст и отловит ArrayIndexOfBoundsException
 */
public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        try {
            System.out.println(values[8]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}

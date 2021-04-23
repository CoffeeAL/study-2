package com.loiko.alex.lesson11;

/**
 * @author Alexey Loiko
 * @project study-2
 */

/**
 * Объявите переменную со значением null. Вызовите метод у этой переменной. Отловите возникшее исключение
 */
public class ExceptionsDemo {

    public static void main(String[] args) {
        String absentValue = null;
        try {
            absentValue.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
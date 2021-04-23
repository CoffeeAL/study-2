package com.loiko.alex.lesson11.nofreetimeexception;

/**
 * @author Alexey Loiko
 * @project study-2
 */

/**
 * Создать свой класс-исключение, являющийся наследником Exception.
 * Создать метод, выбрасывающий это исключение. Вызвать этот метод и отловить исключение.
 * Вывести stack trace на консоль
 */
public class NoFreeTimeExceptionDemo {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", true);
        Person petr = new Person("Petr", false);
        ivan.goSwimming();
        petr.goSwimming();
        System.out.println();
    }
}
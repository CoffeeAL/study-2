package com.loiko.alex.lesson11.nofreetimeexception;

/**
 * @author Alexey Loiko
 * @project study-2
 */
public class NoFreeTimeException extends Exception {

    private static final String MESSAGE = "нет свободного времени";

    public NoFreeTimeException() {
        System.out.println(MESSAGE);
    }
}
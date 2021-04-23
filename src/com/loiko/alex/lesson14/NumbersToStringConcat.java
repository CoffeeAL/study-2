package com.loiko.alex.lesson14;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.util.List;

/**
 * Дан список целых чисел. Вывести строку, представляющих конкатенацию строковых представлений этих чисел
 */
public class NumbersToStringConcat {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 4, 2, 1);
        numbers.stream()
                .map(n -> n.toString())
                .forEach(System.out::print);
    }
}
package com.loiko.alex.lesson14;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.util.List;

/**
 * Дан список целых чисел. Найти среднее всех чисел, которые делятся на 5
 */
public class AverageNumber {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 11, 36, 21, 83, 24, 55, 105);

        double average = numbers.stream()
                .filter(n -> n % 5 == 0)
                .mapToInt(n -> n.intValue())
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
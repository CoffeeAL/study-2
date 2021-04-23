package com.loiko.alex.lesson14;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Дан список строк. Найти количество уникальных строк длиной более 8 символов
 */
public class OverEightSymbols {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Традиционный");
        strings.add("способ");
        strings.add("которым");
        strings.add("класс");
        strings.add("позволяет");
        strings.add("клиенту");
        strings.add("получить");
        strings.add("экземпляр");
        strings.add("предоставление");
        strings.add("открытого");
        strings.add("public");
        strings.add("конструктора");
        strings.add("конструктора");

        long count = strings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
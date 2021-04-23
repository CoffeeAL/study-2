package com.loiko.alex.lesson14;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов
 */
public class ShortKeys {

    public static void main(String[] args) {
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("класс", 4);
        sourceMap.put("может", 32);
        sourceMap.put("предоставить", 35);
        sourceMap.put("открытый", 86);
        sourceMap.put("статический", 22);
        sourceMap.put("фабричный", 28);
        sourceMap.put("метод", 4);

        Set<String> targetSet = sourceMap.keySet().stream()
                .filter(s -> s.length() < 7)
                .collect(Collectors.toSet());

        int result = sourceMap.entrySet().stream()
                .filter(s -> targetSet.contains(s.getKey()))
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(result);
    }
}
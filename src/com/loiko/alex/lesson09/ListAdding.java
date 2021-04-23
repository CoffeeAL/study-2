package com.loiko.alex.lesson09;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод markLength4, принимающий список строк и размещающий строку "****" перед каждым
 * четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте
 */
public class ListAdding {

    private static final String TARGET_STRING = "****";

    public static void main(String[] args) {
        List<String> sourceStrings = new ArrayList<>();
        sourceStrings.add("this");
        sourceStrings.add("is");
        sourceStrings.add("lots");
        sourceStrings.add("of");
        sourceStrings.add("fun");
        sourceStrings.add("for");
        sourceStrings.add("every");
        sourceStrings.add("Java");
        sourceStrings.add("programmer");

        List<String> targetStrings = markLength4(sourceStrings);
        System.out.println(targetStrings);
    }

    public static List<String> markLength4(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String currentString : strings) {
            if (currentString.length() == 4) {
                result.add(TARGET_STRING);
            }
            result.add(currentString);
        }
        return result;
    }
}
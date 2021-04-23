package com.loiko.alex.lesson12;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать программно и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию
 */
public class Numbers {

    public static void main(String[] args) throws IOException {
        File fileWithNumbers = new File("src/com/loiko/alex/lesson12/temp/Numbers.txt");
        boolean created = fileWithNumbers.createNewFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileWithNumbers, true))) {
            writer.append("234 5937 3243 3426773 12 532 6575 3249 6534");
            writer.append(System.lineSeparator());
            writer.append("1123 56 21 -674 753");
            writer.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File fileWithSortedNumbers = new File("src/com/loiko/alex/lesson12/temp/NumbersSorted.txt");
        boolean sortedCreated = fileWithSortedNumbers.createNewFile();

        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileWithNumbers))) {
            String currentLine = bufferedReader.readLine();
            Pattern pattern = Pattern.compile("-*[0-9]*");
            while (currentLine != null) {
                String[] processingString = currentLine.split(" ");
                for (int i = 0; i < processingString.length; i++) {
                    Matcher matcher = pattern.matcher(processingString[i]);
                    if (matcher.matches()) {
                        int a = Integer.parseInt(processingString[i]);
                        numbers.add(a);
                    }
                }
                currentLine = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(numbers);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWithSortedNumbers, true))){
            numbers.forEach(s -> {
                try {
                    bufferedWriter.append(s.toString() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
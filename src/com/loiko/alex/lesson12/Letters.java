package com.loiko.alex.lesson12;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
* Задан файл со стихотворением Сергея Есенина.
* Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
* Вывести результат в файл в виде:
* а - 17
* б - 7 и т.д.
 * * [SOLUTION FROM 27.10.2020]
 */
public class Letters {

    private static final String LETTERS = "абвгдеёжзийклмнопрстуфхцчшщъьэюя";

    public static void main(String[] args) throws IOException {
        File file = new File("src", "com/loiko/alex/lesson12/temp/Esenin.txt");
        file.createNewFile();
        for (int i = 0; i < LETTERS.length(); i++) {
            try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
                int count = 0;
                while (scanner.hasNextLine()) {
                    count += quantityChars(scanner.nextLine(), LETTERS.charAt(i));
                }
                outToFile(LETTERS.charAt(i) + " - " + count + "\n");
                System.out.println(LETTERS.charAt(i) + " - " + count);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static int quantityChars(String stroke, char character) {
        int counter = 0;
        char[] interest = stroke.toLowerCase().toCharArray();
        for (int i = 0; i < interest.length; i++) {
            if (interest[i] == character)
                counter++;
        }
        return counter;
    }

    private static void outToFile(String stroke) throws IOException {
        File fileOut = new File("src", "com/loiko/alex/lesson12/temp/EseninCount.txt");
        fileOut.createNewFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut, true))) {
            bufferedWriter.append(stroke);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
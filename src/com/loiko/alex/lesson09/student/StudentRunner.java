package com.loiko.alex.lesson09.student;

/**
 * @author Alexey Loiko
 * @project study-2
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Создать класс Student с полями имя, фамилия, возраст и средний балл за год.
 * Создать список студентов. Найти и вывести студента с самым высоким средним баллом, используя итератор.
 * Отсортировать студентов по полному имени, возрасту и среднему баллу, используя компараторы
 */
public class StudentRunner {

    public static void main(String[] args) {
        List<Student> sourceStudent = new ArrayList<>();
        sourceStudent.add(new Student("Иван", "Иванов", 21, 6.4));
        sourceStudent.add(new Student("Петр", "Соргин", 22, 9.2));
        sourceStudent.add(new Student("Василий", "Васильев", 29, 7.1));
        sourceStudent.add(new Student("Петр", "Петров", 19, 8.6));
        sourceStudent.add(new Student("Светлана", "Светлая", 20, 9.5));
        sourceStudent.add(new Student("Петр", "Петров", 19, 7.6));
        sourceStudent.add(new Student("Аркадий", "Сидоров", 28, 7.3));
        sourceStudent.add(new Student("Василий", "Васильев", 18, 7.3));

        System.out.println(findBestStudentWithIterator(sourceStudent));
        System.out.println(findBestStudentWithoutIterator(sourceStudent));
        System.out.println("*****");
        List<Student> targetStudent = sortStudentsWithComparator(sourceStudent);
        targetStudent.forEach(System.out::println);

    }

    public static Student findBestStudentWithIterator(List<Student> students) {
        Student bestStudent = students.get(0);
        Iterator<Student> iterator = students.iterator();
        for (Student student : students) {
            if (iterator.next().getRate() > bestStudent.getRate()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public static Student findBestStudentWithoutIterator(List<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getRate).reversed());
        return students.get(0);
    }

    public static List<Student> sortStudentsWithComparator(List<Student> students) {
        students.sort(Comparator.comparing(Student::getFirstName)
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getAge).thenComparing(Student::getRate));
        return students;
    }
}
package com.loiko.alex.lesson14.people;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Alexey Loiko
 * @project study-2
 */

/**
 * Дан класс Person с полями firstName, lastName, age. Вывести полное имя самого старшего человека, у которого
 * длина этого имени не превышает 15 символов
 */
public class OldestPerson {

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Иван", "Иванов", 45));
        people.add(new Person("Петр", "Петров", 65));
        people.add(new Person("Николай", "Сидоров", 32));
        people.add(new Person("Василий", "Васильев", 15));
        people.add(new Person("Арсений", "Арсентьев", 38));
        people.add(new Person("Онуфрий", "Сорокопятов", 105));

        Person resultPerson = people.stream()
                .filter(n -> (n.getFirstName() + n.getLastName()).length() <= 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .findFirst()
                .get();
        System.out.println(resultPerson.getFirstName() + " " + resultPerson.getLastName());
    }
}
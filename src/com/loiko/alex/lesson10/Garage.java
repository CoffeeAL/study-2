package com.loiko.alex.lesson10;

import com.loiko.alex.lesson10.car.Bus;
import com.loiko.alex.lesson10.car.Car;
import com.loiko.alex.lesson10.car.Hatchback;
import com.loiko.alex.lesson10.car.Minivan;
import com.loiko.alex.lesson10.car.Sportcar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Alexey Loiko
 * @project study-2
 */

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также
 * для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 * [SOLUTION FROM 15-16.09.2020]
 */
public class Garage {

    private static int availablePlaces = 15;

    public static void main(String[] args) {
        Bus bus = new Bus("МАЗ", "227", 2005, 200, 120, "Синий");
        Sportcar firstSportcar = new Sportcar("Porsche", "911", 1970, 70, 250, "Красный");
        Sportcar secondSportcar = new Sportcar("Lancia", "Delta", 1982, 75, 220, "Белый");
        Minivan firstMinivan = new Minivan("Renault", "Espace", 1995, 63, 200, "Бирюзовый");
        Minivan secondMinivan = new Minivan("Chrysler", "Voyager", 2002, 60, 205, "Красный");
        Hatchback hatchback = new Hatchback("Citroen", "C2", 2003, 41, 195, "Чёрный");

        Map<Car, Integer> garage = new HashMap<>();
        garage.put(bus, 5);
        garage.put(firstSportcar, 2);
        garage.put(secondSportcar, 0);
        garage.put(firstMinivan, 4);
        garage.put(secondMinivan, 3);
        garage.put(hatchback, 1);

        Set<Map.Entry<Car, Integer>> set = garage.entrySet();
        for (Map.Entry<Car, Integer> cars : set) {
            System.out.print(cars.getKey() + ": ");
            System.out.println(cars.getValue());
            availablePlaces -= cars.getValue();
        }

        System.out.println();
        parking(garage, bus);
        departure(garage, secondMinivan);
        departure(garage, secondSportcar);
        departure(garage, bus);
        departure(garage, bus);
        parking(garage, secondSportcar);
        parking(garage, secondSportcar);
        departure(garage, secondSportcar);
        getQuantity(garage, bus);
        getQuantity(garage, secondSportcar);
    }

    public static void parking(Map<Car, Integer> map, Car car) {
        System.out.println("\nПарковка автомобиля " + car.getMark() + " " + car.getModel());
        if (availablePlaces > 0) {
            System.out.println(car.getColor() + " " + car.getMark() + " " + car.getModel() + " паркуется");
            map.put(car, map.get(car) + 1);
            System.out.println("Сейчас в гараже " + map.get(car) + " автомобилей " + car.getMark());
            availablePlaces--;
        } else {
            System.out.println("Все места заняты. Автомобиль " + car.getMark() + " " + car.getModel() +
                    " отправился на другую парковку");
        }
    }

    public static void departure(Map<Car, Integer> map, Car car) {
        if (map.get(car) == 0) {
            System.out.println("\nАвтомобилей " + car.getMark() + " " + car.getModel() + " в гараже нет");
        } else {
            System.out.println("\nВыезд автомобиля " + car.getMark() + " " + car.getModel());
            System.out.println(car.getColor() + " " + car.getMark() + " " + car.getModel() + " выезжает");
            map.put(car, map.get(car) - 1);
            System.out.println("Сейчас в гараже " + map.get(car) + " автомобилей " + car.getMark());
            availablePlaces++;
        }
    }

    public static int getQuantity(Map<Car, Integer> obj, Car car) {
        System.out.println("\nВ гараже осталось " + obj.get(car) + " автомобилей " + car.getMark() + " " + car.getModel());
        return obj.get(car);
    }
}
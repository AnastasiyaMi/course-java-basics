package com.rakovets.course.javabasics.practice.conditionalstatements;

import javax.swing.*;
import java.net.SocketOption;
import java.util.Scanner;

/**
 * Разработать программу для почты:
 * Определить номер подъезда дома и этаж для данной квартиры, если известно:
 *
 * @param numberFloors             - количество этажей
 * @param numberApartmentsPerFloor - количество квартир на этаже
 * @param apartmentNumber          - номер квартиры
 * @return 'Porch: {0}. Floor: {1}', где {0} - номер подъезда, {1} - номер этажа
 */
public class Task09 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int numberFloors = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int numberApartmentsPerFloor = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int apartmentNumber = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);
        int porch = (apartmentNumber -1) / (numberFloors * numberApartmentsPerFloor) + 1;
        int floor = ((apartmentNumber - 1) % (numberFloors * numberApartmentsPerFloor)) / numberApartmentsPerFloor + 1;
        System.out.println ("Porch: " + porch + ". " + "Floor: " + floor);
    }
}
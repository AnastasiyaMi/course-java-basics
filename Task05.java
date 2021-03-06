package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);
        switch ( monthNumber ) {
            case 1:
                System.out.println ("JANUARY");
                break;
            case 2:
                System.out.println ("FEBRUARY");
                break;
            case 3:
                System.out.println ("MARCH");
                break;
            case 4:
                System.out.println ("APRIL");
                break;
            case 5:
                System.out.println ("MAY");
                break;
            case 6:
                System.out.println ("JUNE");
                break;
            case 7:
                System.out.println ("JULY");
                break;
            case 8:
                System.out.println ("AUGUST");
                break;
            case 9:
                System.out.println ("SEPTEMBER");
                break;
            case 10:
                System.out.println ("OCTOBER");
                break;
            case 11:
                System.out.println ("NOVEMBER");
                break;
            case 12:
                System.out.println ("DECEMBER");
                break;

        }
    }
}
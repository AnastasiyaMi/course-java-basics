package com.rakovets.course.javabasics.practice.conditionalstatements;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра. Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: Unicode (decimal)
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);
        String digits;
        if (letter >= 'а' && letter <= 'я' || letter >= 'А' && letter <= 'Я') {
            System.out.println("cyrillic");
        } else if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
            System.out.println("latin");
        } else if (Character.isDigit(letter)) {
            System.out.println("digit");
        } else {
            System.out.println("undefined");
        }

    }

}
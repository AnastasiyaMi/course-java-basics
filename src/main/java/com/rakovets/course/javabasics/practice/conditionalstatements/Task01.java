package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * После каждого боя выводится таблица статистики боя для команды. Расположение в данной таблице зависит
 * от урона нанесенного в бою. Всего в команде 15 игроков. Определить вошел ли игрок в ТОП-5 игроков своей команды,
 * если известно:
 *
 * @param positionPlayerByDamage - позиция игрока по убыванию урона в своей команде
 * @return 'true'/'false'
 */
public class Task01 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int positionPlayerByDamage = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);
        switch ( positionPlayerByDamage ) {
            case 1:
                System.out.println ("true");
                break;
            case 2:
                System.out.println ("true");
                break;
            case 3:
                System.out.println ("true");
                break;
            case 4:
                System.out.println ("true");
                break;
            case 5:
                System.out.println ("true");
                break;
            case 6:
                System.out.println ("false");
                break;
            case 7:
                System.out.println ("false");
                break;
            case 8:
                System.out.println ("false");
                break;
            case 9:
                System.out.println ("false");
                break;
            case 10:
                System.out.println ("false");
                break;
            case 11:
                System.out.println ("false");
                break;
            case 12:
                System.out.println ("false");
                break;
            case 13:
                System.out.println ("false");
                break;
            case 14:
                System.out.println ("false");
                break;
            case 15:
                System.out.println ("false");
                break;
        }
    }
}
package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками только по одному предмету
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countMarks = INPUT_SCANNER.nextInt();
        int[] marks = nextArray(countMarks);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[] marks) {
        double result = 0;
        for (int d : marks) {
            result += d;
        }
        return new BigDecimal(result / marks.length).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        int min;
        min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }

        return min;
    }

    /**
     * Возвращает максимальну отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {
        Arrays.sort(marks);
        return marks[marks.length - 1];
    }

    private static int[] nextArray(int countMarks) {
        int[] marks = new int[countMarks];
        for (int i = 0; i < countMarks; i++) {
            marks[i] = INPUT_SCANNER.nextInt();
        }
        return marks;
    }
}
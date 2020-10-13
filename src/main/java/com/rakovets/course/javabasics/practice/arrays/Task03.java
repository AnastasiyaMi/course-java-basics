package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double sum = 0;
        int rows = marks.length;
        int columns = marks[0].length;
        double averageMark = 0;
        double [] averageMarksArray = new double [rows];
        for (int i = 0; i < rows; i++) {
            for ( int j = 0; j < columns; j++) {
                sum += marks [i][j];
            }
            averageMark = sum / columns;
            sum = 0;
            BigDecimal bd = new BigDecimal(Double.toString(averageMark));
            bd = bd.setScale (2, RoundingMode.HALF_UP);
            averageMarksArray [i] = bd.doubleValue();
        }
        return averageMarksArray;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int[] MarksArray = new int [marks.length];
        for (int i = 0; i < marks.length; i++) {
            int min = marks [i][0];
            for (int j = 0; j < marks.length; j++) {
                if (min > marks[i][j]) {
                    min = marks[i][j];
                }
                MarksArray[i] = min;
            }
        }
        return MarksArray;
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int[] MarksArray = new int [marks.length];
        for (int i = 0; i < marks.length; i++) {
            int max = marks [i][0];
            for (int j = 0; j < marks.length; j++) {
                if (max < marks[i][j]) {
                    max = marks[i][j];
                }
                MarksArray[i] = max;
            }
        }
        return MarksArray;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}
package com.rakovets.course.javabasics.practice.javaio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileAnalyzeUtil fileAnalyzeUtil = new FileAnalyzeUtil();

        System.out.println(fileAnalyzeUtil.getListOfStrings("./src/main/java/file.txt"));

        System.out.println(fileAnalyzeUtil.getListOfWords("./src/main/java/file.txt"));

        System.out.println(fileAnalyzeUtil.getCheckForLetterMatches("./src/main/java/file.txt"));

        System.out.println(fileAnalyzeUtil.getTheBiggestNumberInALine("./src/main/java/file.txt"));

        System.out.println(fileAnalyzeUtil.getTheRepetitionRateOfLettersInTheText("./src/main/java/file.txt"));

        System.out.println(fileAnalyzeUtil.getTheRepetitionRateOfWordsInTheText("./src/main/java/file.txt"));


    }
}

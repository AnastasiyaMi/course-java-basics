package com.rakovets.course.javabasics.practice.javaio;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.*;

public class FileAnalyzeUtil {
    public ArrayList<String> getListOfStrings(String path) throws IOException {
        ArrayList<String> stringsFromFile = new ArrayList<>();
        FileReader reader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        String line = lineNumberReader.readLine();

        while (line != null) {
            stringsFromFile.add(line);
            line = lineNumberReader.readLine();
        }

        return stringsFromFile;
    }

    public ArrayList<String> getListOfWords(String path) throws IOException {
        ArrayList<String> wordsFromFile = new ArrayList<>();
        FileReader reader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        String[] subStr;
        String line = lineNumberReader.readLine();

        while (line != null) {
            subStr = line.split(" ");

            for (int i = 0; i < subStr.length; i++) {
                String word = subStr[i];

                if (word.charAt(0) == 'A' || word.charAt(0) == 'a' || word.charAt(0) == 'E' || word.charAt(0) == 'e' ||
                        word.charAt(0) == 'I' || word.charAt(0) == 'i' || word.charAt(0) == 'O' || word.charAt(0) == 'o' ||
                        word.charAt(0) == 'U' || word.charAt(0) == 'u' || word.charAt(0) == 'Y' || word.charAt(0) == 'y') {
                    wordsFromFile.add(word);
                }
            }

            line = lineNumberReader.readLine();
        }
        return wordsFromFile;
    }

    public ArrayList<String> getCheckForLetterMatches(String path) throws IOException {
        ArrayList<String> wordsFromFile = new ArrayList<>();
        FileReader reader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        String[] subStr;
        String line = lineNumberReader.readLine();

        while (line != null) {
            subStr = line.split(" ");

            for (int i = 0; i < subStr.length - 1; i++) {
                String word = subStr[i];

                if (subStr[i].charAt(subStr[i].length() - 1) == subStr[i + 1].charAt(0)) {
                    wordsFromFile.add(word);
                }
            }

            line = lineNumberReader.readLine();
        }
        return wordsFromFile;
    }

    public ArrayList<String> getTheBiggestNumberInALine(String path) throws IOException {
        ArrayList<String> numberFromFile = new ArrayList<>();
        FileReader reader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        String[] subStr;
        String line = lineNumberReader.readLine();

        while (line != null) {
            subStr = line.split(" ");
            int numArr[] = new int[subStr.length];

            int high = 0;
            for (int i = 0; i < subStr.length; i++) {
                numArr[i] = Integer.parseInt(subStr[i]);
                if (numArr[i] > high) {
                    numberFromFile.add(subStr[i]);
                    high = numArr[i];
                }
            }
            line = lineNumberReader.readLine();
        }
        return numberFromFile;
    }

    public static Map<Character, Integer> getTheRepetitionRateOfLettersInTheText(String path) throws IOException {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        FileReader reader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        String line = lineNumberReader.readLine();

        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char c = Character.toLowerCase(line.charAt(i));
                Integer val = map.get(c);
                if (val != null) {
                    map.put(c, val + 1);
                } else {
                    map.put(c, 1);
                }
            }

            line = lineNumberReader.readLine();
        }
        return map;
    }

    public static List<Map.Entry<String, Integer>>getTheRepetitionRateOfWordsInTheText(String path) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        FileReader reader = new FileReader(path);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        String[] subStr;
        String line = lineNumberReader.readLine();


        while (line != null) {
            subStr = line.split(" ");

            for (int i = 0; i < subStr.length; i++) {

                Integer val = map.get(subStr[i]);
                if (val != null) {
                    map.put(subStr[i], val + 1);
                } else {
                    map.put(subStr[i], 1);
                }
            }

            line = lineNumberReader.readLine();
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        return list;
    }
}
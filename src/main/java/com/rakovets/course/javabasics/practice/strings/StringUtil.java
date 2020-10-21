package com.rakovets.course.javabasics.practice.strings;

import java.util.Locale;

public class StringUtil {
    //Task 1
    public String getThirdString(String[] args) {
        return String.join(" ", args);
    }
    //Task 2
    public int getIndexOf(String string, char ch) {
        return string.indexOf(ch);
    }
    //Task 3
    public boolean getEqualsString(String string1, String string2) {
        return string1.equals(string2);
    }
    //Task 4
    public String getTrimSpaceInUpperCase(String string) {
        return string.trim().toUpperCase();
    }
    //Task 5
    public String getSubStringFrom10To23Characters(String string1) {
        if (string1.length() < 10) {
            return "Attention: string less than 10 characters";
        }

        String newLine = string1.substring(10);
        if (newLine.length() > 23) {
            return "Attention: new string more than 23 characters";
        }
        return newLine;
    }
    //Task 6
    public String getFunnySmilesInsteadOfTheSad(String string) {
        return string.replace(":(", ":)");
    }
    //Task 7
    public boolean getStringStartsAndEndsWith(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }
    //Task 8
    public int getNumberOfVowels(String string) {
        int number = 0;
        for (char ch : string.toCharArray()) {
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' || ch == 'Y' || ch == 'y')
                number++;
        }
        return number;
    }
    //Task 9
    public int getNumberOfCharacters(String string) {
        int number = 0;
        for (char ch : string.toCharArray()) {
            if (ch == '.' || ch == ',' || ch == '!')
                number++;
        }
        return number;
    }
    //Task 10
    public boolean getPalindrome(String string) {
        String clean = string.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
    //Task 12
    public int getNumbersOfWords(String string) {
        int wordCount = 0;
        boolean word = false;
        int endOfLine = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(string.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(string.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
    //Task 14
    public String getNumbers(String string) {
        String numbers = string.replaceAll("[^0-9]", "");
        return numbers;
    }

}
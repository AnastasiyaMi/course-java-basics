package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    void getThirdStringTest() {
        StringUtil util = new StringUtil();
        Assertions.assertEquals("Good morning", util.getThirdString(new String[]{"Good", "morning"}));
        Assertions.assertEquals("123 QQQ", util.getThirdString(new String[]{"123", "QQQ"}));
        Assertions.assertEquals("!!! aaa", util.getThirdString(new String[]{"!!!", "aaa"}));
        Assertions.assertEquals("! !! a aa", util.getThirdString(new String[]{"! !!", "a aa"}));
    }

    @Test
    void getIndexOfTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(-1, util.getIndexOf("hi", '2'));
        Assertions.assertEquals(3, util.getIndexOf("hi12", '2'));
        Assertions.assertEquals(1, util.getIndexOf("hii", 'i'));
        Assertions.assertEquals(1, util.getIndexOf("h i", ' '));
    }

    @Test
    void getEqualsStringTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(true, util.getEqualsString("hello", "hello"));
        Assertions.assertEquals(true, util.getEqualsString("hello world 123", "hello world 123"));
        Assertions.assertEquals(false, util.getEqualsString("hello", "Hello"));
        Assertions.assertEquals(false, util.getEqualsString("hello", "java"));
    }

    @Test
    void getTrimSpaceInUpperCaseTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals("HELLO", util.getTrimSpaceInUpperCase(" hello "));
        Assertions.assertEquals("HELLO   JAVA", util.getTrimSpaceInUpperCase(" Hello   JaVa "));
        Assertions.assertEquals("HELLO 123", util.getTrimSpaceInUpperCase(" hello 123 "));
    }

    @Test
    void getSubStringFrom10To23CharactersTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals("yone", util.getSubStringFrom10To23Characters("Hello everyone"));
        Assertions.assertEquals("Attention: string less than 10 characters", util.getSubStringFrom10To23Characters("Hello"));
        Assertions.assertEquals("Attention: new string more than 23 characters", util.getSubStringFrom10To23Characters("Today is 20 October, and it is the beautiful day of the year."));
    }

    @Test
    void getFunnySmilesInsteadOfTheSadTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(": ( hello world", util.getFunnySmilesInsteadOfTheSad(": ( hello world"));
        Assertions.assertEquals("hello :) java", util.getFunnySmilesInsteadOfTheSad("hello :( java"));
        Assertions.assertEquals("hello :) world", util.getFunnySmilesInsteadOfTheSad("hello :) world"));
        Assertions.assertEquals(":)hi :) everyone :)", util.getFunnySmilesInsteadOfTheSad(":(hi :( everyone :("));
    }
    @Test
    void getStringStartsAndEndsWithTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(true, util.getStringStartsAndEndsWith("hello hello", "hello"));
        Assertions.assertEquals(true, util.getStringStartsAndEndsWith("hello", "hello"));
        Assertions.assertEquals(false, util.getStringStartsAndEndsWith("hello", "java"));
        Assertions.assertEquals(true, util.getStringStartsAndEndsWith("hello world hello", "hello"));
        Assertions.assertEquals(false, util.getStringStartsAndEndsWith("hello world hello! ", "hello"));
    }

    @Test
    void getNumberOfVowelsTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(2, util.getNumberOfVowels("hello"));
        Assertions.assertEquals(6, util.getNumberOfVowels("hello hello hEllO"));
        Assertions.assertEquals(0, util.getNumberOfVowels("hll1230"));
        Assertions.assertEquals(7, util.getNumberOfVowels("hi, how are you"));
    }

    @Test
    void getNumberOfCharactersTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(2, util.getNumberOfCharacters(".hello."));
        Assertions.assertEquals(5, util.getNumberOfCharacters("!hello! ,hello, hEllO."));
        Assertions.assertEquals(0, util.getNumberOfCharacters("hello"));
        Assertions.assertEquals(7, util.getNumberOfCharacters(".....hi, how are you!?"));
    }

    @Test
    void getPalindromeTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(true, util.getPalindrome("ana"));
        Assertions.assertEquals(true, util.getPalindrome("ana ana ana ana"));
        Assertions.assertEquals(false, util.getPalindrome("anastasiya"));
        Assertions.assertEquals(true, util.getPalindrome("5111115"));
        Assertions.assertEquals(false, util.getPalindrome("hello java"));
    }

    @Test
    void getNumbersOfWordsTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals(2, util.getNumbersOfWords(" hello  hello "));
        Assertions.assertEquals(1, util.getNumbersOfWords("hello"));
        Assertions.assertEquals(4, util.getNumbersOfWords("hi  how   are u  "));
        Assertions.assertEquals(0, util.getNumbersOfWords(""));
    }

    @Test
    void getNumbersTest () {
        StringUtil util = new StringUtil();
        Assertions.assertEquals("123", util.getNumbers("123hello"));
        Assertions.assertEquals("12345", util.getNumbers("1hello, 2how 3are 4 you5"));
        Assertions.assertEquals("", util.getNumbers("hello"));
        Assertions.assertEquals("12345", util.getNumbers("12345"));
    }

}


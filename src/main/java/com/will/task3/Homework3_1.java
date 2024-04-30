package com.will.task3;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework3_1 {

    /**
     * Реализовать метод который считает количество слов встречающихся в заданном тексте.
     * @param text - заданный текст
     * @return - словарь слов и количество их появлений в данном тексте
     */

    public Map<String, Integer> countWords(String text) {

        return Stream.of(text.toLowerCase().replaceAll("\\p{Punct}", " ").split("\\s+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
    }
}

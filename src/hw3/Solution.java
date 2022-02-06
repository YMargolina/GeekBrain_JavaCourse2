package hw3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Яблоко", "Персик", "Мандарин", "Апельсин", "Абрикос", "Абрикос", "Банан", "Красное яблоко", "Зеленое яблоко", "Персик");
        Map<String, Integer> wordsCount = new HashMap<>();

        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }

        wordsCount.forEach((k, v) -> {
            System.out.println(k);
        });

        //System.out.println(words);
        System.out.println(wordsCount);
    }
}

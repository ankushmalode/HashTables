package com.bridgelabz;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] a = sentence.toLowerCase().split(" ");
        System.out.println(Arrays.toString(a));
        Map<String, Integer> words = new HashMap<>();
        for (String word : a) {
            if (words.containsKey(word)) {
                words.put(word, 1 + words.get(word));
            } else {
                words.put(word, 1);
            }
        }
        System.out.println(words);
    }
}

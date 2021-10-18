package com.bridgelabz;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        String sentence1 = "To be or not to be";
        String[] a = sentence1.toLowerCase().split(" ");
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

        String sentence2 = "Paranoids are not paranoid because they are paranoid but" +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] b = sentence2.toLowerCase().split(" ");
        System.out.println("\n"+Arrays.toString(b));
        Map<String,Integer> words2 = new HashMap<>();
        for (String word : b) {
            if (words2.containsKey(word)) {
                words2.put(word,1 + words2.get(word));
            } else {
                words2.put(word,1);
            }
        }
        System.out.println(words2);
    }
}

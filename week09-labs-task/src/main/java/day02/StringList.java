package day02;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public List<String> shortestWords(List<String> words) {
        int minLength = shortestWordsLength(words);
        List<String> shortestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == minLength) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    private int shortestWordsLength(List<String> words) {
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            if (word == null || word.isBlank()) {
                throw new IllegalArgumentException("Not a word!");
            } else {
                if (minLength > word.length()) {
                    minLength = word.length();
                }
            }
        }
        return minLength;
    }
}

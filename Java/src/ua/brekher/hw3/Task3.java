package ua.brekher.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String inputString = bufferedReader.readLine();
        int wordCount = countWords(inputString);
        System.out.println("Word number in string: " + wordCount);
    }

    public static int countWords(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] charArray = s.toCharArray();
        int wordCount = 0;
        boolean inWord = false;
        for (char c : charArray) {
            if (isLetter(c)) {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return wordCount;
    }

    private static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }


}

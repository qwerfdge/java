package ua.brekher.hw11.task2;

import java.util.*;

public class StringLengthCounter {
    public static Map<String, Integer> countStringLength(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String str : strings) {
            int length = str.length();
            resultMap.put(str, length);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("here", "there", "table");
        Map<String, Integer> result = countStringLength(strings);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}


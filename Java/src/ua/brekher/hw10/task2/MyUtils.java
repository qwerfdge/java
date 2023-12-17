package ua.brekher.hw10.task2;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum: " + getSum(numbers));

        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Odd Numbers: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("String List: " + stringList);

        List<String> doubledList = doubling(stringList);
        System.out.println("Doubled List: " + doubledList);
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }


    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String str : strings) {
            doubledList.add(str + str);
        }
        return doubledList;
    }
}

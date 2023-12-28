package ua.brekher.hw11.task3;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTimeArrayListAdd = System.nanoTime();
        addElements(arrayList, 100000);
        long endTimeArrayListAdd = System.nanoTime();
        long durationArrayListAdd = endTimeArrayListAdd - startTimeArrayListAdd;
        System.out.println("Addition 100000 elements into ArrayList took a while : " + durationArrayListAdd + " nanoseconds");

        long startTimeLinkedListAdd = System.nanoTime();
        addElements(linkedList, 100000);
        long endTimeLinkedListAdd = System.nanoTime();
        long durationLinkedListAdd = endTimeLinkedListAdd - startTimeLinkedListAdd;
        System.out.println("Addition 100000 elements into LinkedList took a while: " + durationLinkedListAdd + " nanoseconds");

        long startTimeArrayListGet = System.nanoTime();
        getRandomElements(arrayList, 100000);
        long endTimeArrayListGet = System.nanoTime();
        long durationArrayListGet = endTimeArrayListGet - startTimeArrayListGet;
        System.out.println("Selection of 100000 elements at random from ArrayList took a while: " + durationArrayListGet + " nanoseconds");

        long startTimeLinkedListGet = System.nanoTime();
        getRandomElements(linkedList, 100000);
        long endTimeLinkedListGet = System.nanoTime();
        long durationLinkedListGet = endTimeLinkedListGet - startTimeLinkedListGet;
        System.out.println("Selection of 100000 elements at random from LinkedList took a while: " + durationLinkedListGet + " nanoseconds");
    }

    public static void addElements(List<Integer> list, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt());
        }
    }

    public static void getRandomElements(List<Integer> list, int count) {
        Random random = new Random();
        int size = list.size();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(size);
            list.get(randomIndex);
        }
    }
}

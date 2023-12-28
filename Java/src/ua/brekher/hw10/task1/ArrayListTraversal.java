package ua.brekher.hw10.task1;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListTraversal {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");


        System.out.println("Cycle for:");
        for (String s : arrayList) System.out.println(s);

        System.out.println("\nCycle for-each:");
        for (String element : arrayList) System.out.println(element);

        System.out.println("\nCycle while:");
        int index = 0;
        while (index < arrayList.size()) System.out.println(arrayList.get(index++));

        System.out.println("\nIterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}

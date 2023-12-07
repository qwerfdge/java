package ua.brekher.hw10;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Элемент 1");
        arrayList.add("Элемент 2");
        arrayList.add("Элемент 3");
        arrayList.add("Элемент 4");


        System.out.println("Цикл for:");
        for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i));

        System.out.println("\nЦикл for-each:");
        for (String element : arrayList) System.out.println(element);

        System.out.println("\nЦикл while:");
        int index = 0;
        while (index < arrayList.size()) System.out.println(arrayList.get(index++));

        System.out.println("\nИтератор:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}

package com.gokulnathp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListC {
    public static void iterator(ArrayList arrayList) {
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(3);

        Collections.sort(arrayList);
        arrayList.sort((Integer o1, Integer o2) -> o1 < o2 ? 10 : -10);

        iterator(arrayList);

        for(Object object: arrayList) {
            System.out.println(object);
        }
    }
}

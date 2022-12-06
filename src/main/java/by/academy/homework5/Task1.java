package by.academy.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task1 <T> {

    public static <T> HashSet<T> returnSet(ArrayList<T> arrayList){
        return new HashSet(arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(1);
        arrayList.add(30);
        System.out.println(returnSet(arrayList));
    }
}

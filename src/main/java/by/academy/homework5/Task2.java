package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

    static long startArrayList;
    static long startLinkedList;

    public static int[] mathRandom(){
        int[] array = new int[1_000];
        for (int i = 0; i < 1_000; i++){
            array[i] = (int)(Math.random() * 1_000);
        }
        return array;
    }

    public static void addToArrayList(ArrayList<Integer> arrayList){
        startArrayList = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++){
            arrayList.add(i);
        }
    }

    public static void addToLinkedList(LinkedList<Integer> linkedList){
        startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++){
            linkedList.add(i);
        }
    }

    public static long getToArrayList(ArrayList<Integer> arrayList, int[] array){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(array[i]);
        }
        long endArrayList = System.currentTimeMillis();
        return endArrayList - startArrayList;
    }

    public static long getToLinkedList(LinkedList<Integer> linkedList, int[] array){
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(array[i]);
        }
        long endLinkedList = System.currentTimeMillis();
        return endLinkedList - startArrayList;
    }

    public static void main(String[] args) {
        int[] array = mathRandom();
        ArrayList<Integer> arrayList = new ArrayList<>(1_000);
        addToArrayList(arrayList);
        System.out.println("Время работы ArrayList: " +  getToArrayList(arrayList, array));
        LinkedList<Integer> linkedList = new LinkedList<>();
        addToLinkedList(linkedList);
        System.out.println("Время работы LinkedList: " + getToLinkedList(linkedList, array));
    }
}

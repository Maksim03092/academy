package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {

        int max = 0;

        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            mark.add((int)(Math.random() * 11));
            System.out.print(mark.get(i) + " ");
        }

        Iterator<Integer> integers = mark.iterator();
        System.out.println();

        while (integers.hasNext()){
            boolean check = true;
            if (max < integers.next() || check){
                max = integers.next();
                check = false;
            }
        }
        System.out.println(max);
    }
}

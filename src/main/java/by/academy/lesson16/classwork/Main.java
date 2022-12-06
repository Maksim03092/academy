package by.academy.lesson16.classwork;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<HeavyBox> box = new ArrayList<HeavyBox>();

        box.add(new HeavyBox(12,2,3,4));
        box.add(new HeavyBox(15,3,4,5));
        box.add(new HeavyBox(20,6,7,8));

        box.get(0).setWeight(2);

        box.remove(2);

        Object[] boxArray  = box.toArray();
        for (Object element : boxArray){
            System.out.println(element);
        }

        HeavyBox[] stringArray = new HeavyBox[box.size()];
        box.toArray(stringArray);
        System.out.println(Arrays.toString(stringArray));

        for (HeavyBox element : box){
            System.out.println(element);
        }

        box.clear();

    }
}

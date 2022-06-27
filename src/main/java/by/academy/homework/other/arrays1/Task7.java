package by.academy.homework.other.arrays1;

import java.util.Scanner;

public class Task7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++){
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int element : array){
            System.out.print(element + "\t");
        }
    }
}

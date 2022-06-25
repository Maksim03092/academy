package by.academy.homework.other.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int [][] array1 = new int[5][2];
        int max = 0, min = 0;
        boolean forMax = true, forMin = true;
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                    if (forMax == true || max < array[i][j]) {
                        max = array[i][j];
                        forMax = false;
                    }
                    if (forMin == true || min > array[i][j]) {
                        min = array[i][j];
                        forMin = false;
                    }
            }
            array1[i][0] = max;
            array1[i][1] = min;
            max = 0;
            min = 0;
            forMax = true;
            forMin = true;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array1[i][j]+ "\t");
            }
            System.out.println("\n");
        }
    }
}

package by.academy.homework.other.arrays;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double[] array = new double[4];

        System.out.print("Введите значения масива: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextDouble();
        }
        System.out.println(array[0]);
    }
}

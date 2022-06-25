package by.academy.homework.other.arrays2;

import java.util.Scanner;

public class Array {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
            sum += array[i];
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++){
            if (sum / size > array[i]){
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println("\n");
        System.out.println(sum / size);
    }
}

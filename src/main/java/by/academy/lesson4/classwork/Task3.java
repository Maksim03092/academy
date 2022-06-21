package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите максимальное количество чисел: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int k = 0, j = 0, u = 0;
        for (int i =0; i < n; i++){
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0){
                k++;
            }
            if (number > 0){
                j++;
            }
            if (number == 0){
                u++;
            }
        }
        System.out.println("Количество отрицательных чисел: "+ k + " Количество положительных чисел: "+
                           j + " Количество нулей: " + u);
        scanner.close();
    }
}

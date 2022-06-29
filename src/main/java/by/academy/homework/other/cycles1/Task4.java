package by.academy.homework.other.cycles1;

import java.util.Scanner;
import java.util.SortedSet;

public class Task4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int size_1 = 0, size1 = 0, size0 = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Введите значение: ");
            int number = scanner.nextInt();
            if (number > 0){
                size1++;
            }
            else if (number < 0){
                size_1++;
            }
            else {
                size0++;
            }
        }
        System.out.println("\n");
        System.out.println("Количество положительных чисел: "+ size1);
        System.out.println("Количество отрицательных чисел "+ size_1);
        System.out.println("Количество нулей "+ size0);
    }
}

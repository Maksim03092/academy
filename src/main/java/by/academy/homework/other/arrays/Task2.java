package by.academy.homework.other.arrays;

import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] array = new  String[3][6];

        System.out.print("Введите значения массива: ");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 6; j++){
                array[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 6; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println('\n');
        }
    }
}

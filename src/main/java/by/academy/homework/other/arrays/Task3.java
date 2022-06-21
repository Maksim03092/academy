package by.academy.homework.other.arrays;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] array = new char[4][2];

        System.out.println("Введите значения массива");

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 2; j++){
                array[i][j] = scanner.next().charAt(0);
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 2; j++){
                if ( j == 1 ) {
                    System.out.println("\n");
                }
                System.out.println(array[i][j]);
            }
        }
    }

}

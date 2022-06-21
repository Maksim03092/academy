package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите значение числа: ");

        int n = scanner.nextInt();
        int com = 1;

        for (int i = 1; i < n; i++) {
            com *= i;
        }
        System.out.println(com);
    }
}

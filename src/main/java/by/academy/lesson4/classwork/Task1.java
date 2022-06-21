package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите значение числа: ");

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

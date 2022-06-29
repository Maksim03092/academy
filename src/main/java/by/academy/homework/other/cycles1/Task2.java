package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите значение: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите значение: ");
        int n = scanner.nextInt();
        scanner.close();

        int mou = 1;

        for (int i = 1; i < n; i++) {
            mou *= i;
        }
        System.out.println(mou);
    }
}

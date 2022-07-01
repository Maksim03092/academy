package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task22 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        double sum = 1;

        for (int i = 2; i <= n; i++){
            sum += (double) 1/i;
            System.out.println(i + " " + sum);
        }
        System.out.println(sum);
    }
}

package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task21 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum +=(double) 1/(2*i);
            System.out.println(i + " " + sum);
        }
        System.out.println(sum);
    }
}

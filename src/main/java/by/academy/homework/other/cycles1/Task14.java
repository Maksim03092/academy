package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task14 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 1; i < number; i++){
            sum += i*i;
            System.out.println(i + " " + sum);
        }
        System.out.println(sum);
    }
}

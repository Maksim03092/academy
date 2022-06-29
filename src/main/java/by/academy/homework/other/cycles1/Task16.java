package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task16 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество сенокосилок: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество часов, которые первая сенокосилка будет работать: ");
        int m = scanner.nextInt();
        m *= 60;
        for (int i = 0; i < n - 1; i++){
            m += 10;
        }
        System.out.print("Бригада проработала " + (m / 60) + " часов и " + m % 60 + " минут");
        System.out.println("\n" + m);
    }
}

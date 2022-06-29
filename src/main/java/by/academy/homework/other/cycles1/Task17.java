package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task17 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество учащихся: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Введите рост учащегося: ");
            double height = scanner.nextDouble();
            sum += height;
        }
        System.out.print("\nСредний рост учащихся: " + sum / n);
    }
}

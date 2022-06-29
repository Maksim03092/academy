package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task18 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();
        int quantity = 0;

        for (int i = 0; i < n; i++){
            if (i % 2  != 0 && i % 3 != 0 && i % 5 != 0){
                System.out.print(i + "\t");
                quantity++;
            }
        }
        System.out.print("\n" + quantity);
    }
}

package by.academy.homework.other.operators;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Чётное");
        }
        else{
            System.out.println("Нечётное");
        }

    }
}

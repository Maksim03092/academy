package by.academy.homework.other.cycles;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >=0 && number <= 10){
            System.out.println("Положительное число, которое меньше либо равно 10");
        }
        else{
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}

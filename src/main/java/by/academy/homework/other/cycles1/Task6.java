package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("На какой срок вы хотите сделат вклад (лет): ");
        int year = scanner.nextInt();
        scanner.close();

        double money = 5;

        for (int i = 0; i < year; i++){
            money += money*0.03;
            System.out.println(money + " " + (i+1) + " год");
        }
    }
}

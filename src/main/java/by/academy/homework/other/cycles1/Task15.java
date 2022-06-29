package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task15 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        double number = scanner.nextInt();
        System.out.print("Введите степень, в которую вы хотите возвести число: ");
        int degree = scanner.nextInt();
        if (degree < 0){
            number = 1 / number;
            degree = -degree;
        }
        double oldNumber = number;
        for (int i = 0; i < degree; i++){
            number *= oldNumber;
            System.out.println(number + "\t");
        }
    }
}

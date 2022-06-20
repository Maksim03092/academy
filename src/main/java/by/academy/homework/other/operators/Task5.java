package by.academy.homework.other.operators;

import java.util.Scanner;

public class Task5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double firstNumber = 0, secondNumber =0;

        System.out.println("Введите два числа: ");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println(firstNumber + " максимальное число " +
                               secondNumber + " минимальное число " +
                               (firstNumber+secondNumber)/2 + " среднее арифметическое двух чисел" );
        }
        else {
            System.out.println(secondNumber + " максимальное число " +
                               firstNumber + " минимальное число " +
                               (firstNumber+secondNumber)/2 + " среднее арифметическое двух чисел" );
        }

    }
}

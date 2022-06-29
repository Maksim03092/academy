package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task7 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            if (firstNumber >= secondNumber){
                System.out.println(firstNumber);
            }
            else {
                System.out.println(secondNumber);
            }
        }
        scanner.close();
    }
}

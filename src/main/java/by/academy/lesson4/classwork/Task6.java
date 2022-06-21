package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите 10 парк чисел");

        for (int i = 0; i < 10; i++){
            System.out.print("Введите первое число: ");
            int numberFirst = scanner.nextInt();
            System.out.print("\nВведите второе число: ");
            int numberSecond = scanner.nextInt();
            if (numberFirst > numberSecond){
                System.out.println(numberFirst);
            }
            else if (numberFirst == numberSecond){
                System.out.println((numberFirst)+ " " +(numberSecond));
            }
            else {
                System.out.println(numberSecond);
            }
        }
    }
}

package by.academy.homework.other.cycles;

import java.util.Scanner;

public class Task0 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        String number = scanner.nextLine();

        scanner.close();

        if (Integer.parseInt(number) % 2 != 0){
            System.out.println(number);
        }
        else{
            System.out.println("Ничего");
        }
    }
}

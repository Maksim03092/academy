package by.academy.homework.other.cycles;

import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число от 1 до 7: ");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("Понедельник");
        }
        else if (number == 2){
            System.out.println("Вторник");
        }
        else if (number == 3){
            System.out.println("Среда");
        }
        else if (number ==4){
            System.out.println("Четверг");
        }
        else if (number == 5){
            System.out.println("Пятница");
        }
        else if (number == 6 || number == 7){
            System.out.println("Выходной");
        }
        else {
            System.out.println("Я не знаю такой команды");
        }
    }
}

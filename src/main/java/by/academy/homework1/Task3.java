package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        byte value;

        while (true) {
            System.out.print("Введите значение от 1 до 10: ");
            value = scanner.nextByte();
            if (value >= 1 && value <=10){
                System.out.println("Таблица умнажения для числа "+ value);
                System.out.print("1 * " + value + " = " + value*1 + "\n"+
                        "2 * " + value + " = " + value*2 + "\n"+
                        "3 * " + value + " = " + value*3 + "\n"+
                        "4 * " + value + " = " + value*4 + "\n"+
                        "5 * " + value + " = " + value*5 + "\n"+
                        "6 * " + value + " = " + value*6 + "\n"+
                        "7 * " + value + " = " + value*7 + "\n"+
                        "8 * " + value + " = " + value*8 + "\n"+
                        "9 * " + value + " = " + value*9 + "\n"+
                        "10 * " + value + " = " + value*10 + "\n");
                break;
            }
            else {
                System.out.println("Вы вели не то значение. Повторите попытку.");
            }
        }
        scanner.close();
    }
}

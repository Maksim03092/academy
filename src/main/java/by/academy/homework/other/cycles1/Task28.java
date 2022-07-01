package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task28 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите ссуду, которую взял бизнессмен: ");
        double money = scanner.nextDouble();
        System.out.print("Введите сумму, которую он привысет через несколько лет: ");
        double money1 = scanner.nextDouble();
        int year = 0;

        while (true){
            year++;
            if (money + money * 0.2 < money1) {
                money += money * 0.2;
                System.out.print("Долг: " + money + "\t");
            }
            else{
                break;
            }
        }
        System.out.println("\n" + year);
    }
}

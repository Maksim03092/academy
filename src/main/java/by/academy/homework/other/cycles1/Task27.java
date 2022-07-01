package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task27 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество денег у мальчика Пети: ");
        double money = scanner.nextDouble();
        System.out.print("Введите скольуо стоит мороженное: ");
        double price = scanner.nextDouble();
        int k = 0;

        while (true){
            if (money - price >= 0){
                money -= price;
                k++;
            }
            else {
                break;
            }
        }
        System.out.println("Количетсов мороженного, которое съел мальчик равно: " + k);
        System.out.println("Количство оставшихся денег: " + money);
    }
}

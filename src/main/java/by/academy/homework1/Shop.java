package by.academy.homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        int age = 0;
        double price = 0;
        boolean active = true;

        Scanner in = new Scanner(System.in);

        while (active) {
            System.out.print("Введите сумму покупки в магазине: ");
            price = in.nextDouble();
            if (price > 0){
                break;
            }
            else {
                System.out.println("Вы неправильно вели цену");
            }
        }
        while (active){
            try {
                System.out.print("Введите возраст покупателя: ");
                age = in.nextInt();
                if (age > 0 && age < 130) {
                    break;
                }
                else {
                    System.out.println("Вы ввели неправильный возраст");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Вы вели не тот тит данных");
            }
            in.nextLine();
        }
        in.close();

        if (price < 100){
            System.out.println(price * 0.95);
        }
        else if (price >= 100 && price < 200){
            System.out.println(price * 0.93);
        }
        else if (price >= 200 && price < 300){
            if (age > 18) {
                System.out.println(price * 0.84);
            }
            else {
                System.out.println(price * 0.91);
            }
        }
        else if (price >= 300 && price < 400){
            System.out.println(price * 0.85);
        }
        else{
            System.out.println(price * 0.8);
        }
    }
}

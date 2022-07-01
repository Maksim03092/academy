package by.academy.homework3;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        User seller = new User("Max",1000);
        User buyer = new User("Nick", 1000);

        System.out.print("Введите количество продуктов: ");
        int n = scanner.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++){
            System.out.println("Введите цену,  название продукта и количество которое вы хотите преобрести: ");
            products[i] = new Product(scanner.nextDouble(),scanner.nextLine(), scanner.nextInt());
        }
        Deal deal = new Deal(seller,buyer,products);
        deal.bill(deal);
    }
}

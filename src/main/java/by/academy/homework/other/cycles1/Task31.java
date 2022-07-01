package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task31 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите размер ткани: ");
        int M = scanner.nextInt();
        System.out.print("Введите размер ткани, который необходим на производстве: ");
        int m = scanner.nextInt();

        while (true){
            if (m < M){
                M -= m;
                System.out.println(M);
            }
            else{
                System.out.print("Необходимо заказать ткань !!!");
                break;
            }
        }
    }
}

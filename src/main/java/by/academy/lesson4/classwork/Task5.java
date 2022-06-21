package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите срок на который вы положили 5 рублей в банк: ");
        int n = scanner.nextInt();
        double score = 5;

        for(int i =0; i < n; i++){
            score = score + score*3/100;
            System.out.println(score);
        }
    }

}

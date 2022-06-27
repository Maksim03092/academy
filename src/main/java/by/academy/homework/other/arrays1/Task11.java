package by.academy.homework.other.arrays1;

import java.util.Scanner;
import java.util.SortedSet;

public class Task11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n, sum1 = 0, sum2 = 0;

        while (true){

            System.out.print("Введите размер массива (должно быть чётное число): ");
            n = scanner.nextInt();

            if (n % 2 == 0){
                break;
            }
            else {
                System.out.println("Вы вели непарвильное значение");
                continue;
            }
        }
        scanner.close();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*11)-5;
            if (i < array.length / 2 ){
                sum1 += Math.abs(array[i]);
            }
            else {
                sum2 += Math.abs(array[i]);
            }
        }
        for (int element : array){
            System.out.print(element + "\t");
        }
        System.out.println("\n");
        System.out.println(sum1 + "\t" + sum2);
        System.out.println("\n");
        if (sum1 > sum2){
            System.out.println("Первая половина массива больше второй");
        }
        else if (sum1 == sum2){
            System.out.println("Первая половина равна второй половине");
        }
        else {
            System.out.println("Вторая половина массива больше первой");
        }
    }
}

package by.academy.homework.other.arrays1;

import java.util.Scanner;

public class Task13 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n, check = 0;

        while (true) {
            System.out.print("Введите размер массива (размер должен быть больше 3): ");
            n = scanner.nextInt();
            if (n > 3){
                break;
            }
            else{
                System.out.println("Вы вели неправильный размер массива");
                continue;
            }
        }
        scanner.close();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + "\t");
            if (array[i] % 2 == 0) {
                check++;
            }
        }

        System.out.println("\n");

        int[] array1 = new int[check];
        int index = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                array1[index] = array[i];
                System.out.print(array1[index] + "\t");
                index++;
            }
            if (index == check){
                break;
            }
        }
    }
}

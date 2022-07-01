package by.academy.homework.other.String;

import java.util.Scanner;

public class Task7 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        boolean check = true;

        String[] words = new String[n];
        int[] array = new int[128];

        for (int i = 0; i < n; i++){
            System.out.print("Введите слово: ");
            words[i] = scanner.next();
        }
        scanner.close();

        for (int i = 0; i < n; i++){
            String word = words[i];
            for (int j = 0; j < array.length; j++){
                for (int c = 0; c < word.length(); c++){
                    if (word.charAt(c) == j){
                        array[j]++;
                    }
                }
            }
            for (int j = 0; j < array.length; j++){
                if (array[j] > 1){
                    check = false;
                }
            }
            if (check == true){
                System.out.println(word);
                break;
            }
            check = true;
        }
    }
}

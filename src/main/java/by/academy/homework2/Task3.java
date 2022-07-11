package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        scanner.close();
        for(int i = 0; i < word1.length() / 2; i++ ){
            System.out.print(word1.charAt(i));
        }
        for (int i = word2.length() / 2; i < word2.length(); i++){
            System.out.print(word2.charAt(i));
        }
    }
}

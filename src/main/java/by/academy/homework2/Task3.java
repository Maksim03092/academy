package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первое слова");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово");
        String word2 = scanner.nextLine();

        for(int i = 0; i < word1.length()/2; i++ ){
            System.out.print(word1.charAt(i));
        }
        for (int i = word2.length()/2; i < word2.length(); i++){
            System.out.print(word2.charAt(i));
        }
        scanner.close();
    }
}

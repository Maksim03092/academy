package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        if (word1.length() != word2.length()){
            System.out.println("false");
        }
        else{
            int counter1 = 0, counter2 = 0;
            for (int i = 0; i < word1.length(); i++){
                counter1 += word1.charAt(i);
                counter2 += word2.charAt(i);
                }
            if (counter1 == counter2 ){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        scanner.close();
    }
}

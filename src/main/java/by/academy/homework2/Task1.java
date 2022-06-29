package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] symbols = new int[255];

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        scanner.close();

        boolean check = true;

        if (word1.length() != word2.length()){
            check = false;
        }
        else {
            for (int i = 0; i < symbols.length; i++){
                for (int j = 0; j < word1.length(); j++){
                    if (i == word1.charAt(j)){
                        symbols[i]++;
                    }
                }
                for (int j = 0; j < word2.length(); j++){
                    if (i == word2.charAt(j)){
                        symbols[i]--;
                    }
                }
            }
        }
        for (int i = 0; i < symbols.length; i++){
            System.out.print(symbols[i] + "\t");
            if (symbols[i] != 0){
                check = false;
                break;
            }
        }
        System.out.println("\n"+check);
    }
}

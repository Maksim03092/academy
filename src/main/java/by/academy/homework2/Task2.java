package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        int max = 0;
        int index = 0;
        boolean check = false;

        System.out.print("Введите слова: ");
        String[] words = scanner.nextLine().split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] symbols = new char[word.length()];
            for (int j = 0; j < word.length(); j++){
                if (j == 0){
                    symbols[j] = word.charAt(j);
                    n++;
                }
                else {
                    for (int c = 0; c < symbols.length; c++){
                        if (symbols[c] == word.charAt(j)){
                            check = true;
                        }
                    }
                    if (check == false){
                        symbols[j] = word.charAt(j);
                        n++;
                    }
                }
            }

            if (max == 0 || max > n){
                max = n;
                index = i;
                n = 0;
            }
            else
                n = 0;
        }
        System.out.println(words[index]);
    }
}

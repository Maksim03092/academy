package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 0, min = 0, index = 0;
        boolean check = true;
        System.out.print("Введите слова: ");
        String[] words = scanner.nextLine().split(" ");
        scanner.close();
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            char[] symbols = new char[word.length()];
            for (int j = 0; j < word.length(); j++){
                if (j == 0){
                    symbols[j] = word.charAt(j);
                    size++;
                }
                else {
                    for (int c = 0; c < symbols.length; c++){
                        if (symbols[c] == word.charAt(j)) {
                            check = false;
                        }
                    }
                    if (check == true){
                        symbols[j] = word.charAt(j);
                        size++;
                    }
                }
                check = true;
            }
            if (min == 0 || min > size){
                min = size;
                index = i;
            }
            size = 0;
        }
        System.out.println(words[index]);
    }
}

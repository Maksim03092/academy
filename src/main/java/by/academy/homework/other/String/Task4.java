package by.academy.homework.other.String;

import java.util.Scanner;

public class Task4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Введите слова: ");
        int[] symbols = new int[128];
        String[] words = scanner.nextLine().split(" ");
        int k = 0, min = 0, index = 0;
        boolean forMin = true;

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            for (int j = 0; j < symbols.length; j++){
                for (int c = 0; c < word.length(); c++){
                    if (word.charAt(c) == j){
                        symbols[j]++;
                    }
                }
            }
            for (int j = 0; j < symbols.length; j++){
                if (symbols[j] != 0){
                    k++;
                    symbols[j] = 0;
                }
            }
            if (forMin == true || min > k){
                min = k;
                forMin = false;
                index = i;
            }
            k = 0;
        }
        System.out.println(words[index]);
    }
}

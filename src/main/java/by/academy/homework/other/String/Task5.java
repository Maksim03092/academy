package by.academy.homework.other.String;

import java.util.Scanner;

public class Task5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[52];
        int A = 65, a = 97, k = 0, check = 0;

        for (int i = 0; i < array.length; i++){
            if (i < args.length / 2){
                array[i] = A;
                A++;
            }
            else{
                array[i] = a;
                a++;
            }
        }

        System.out.print("Введите слова: ");
        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            for (int j = 0; j < array.length; j++) {
                for (int c = 0; c < word.length(); c++) {
                    if (array[j] == word.charAt(c)){
                        check++;
                    }
                }
            }
            if (check == word.length()){
                for (int j = 0; j < word.length(); j++){
                    if (word.charAt(j) == 65 || word.charAt(j)== 97 ||
                        word.charAt(j) == 69 || word.charAt(j) == 101 ||
                        word.charAt(j) == 79 || word.charAt(j) == 111 ||
                        word.charAt(j) == 73 || word.charAt(j) == 105 ||
                        word.charAt(j) == 85 || word.charAt(j) == 117 ||
                        word.charAt(j) == 89 || word.charAt(j) == 121){
                     k++;
                    }
                }
            }
            if (k == (double)word.length() / 2){
                System.out.println(word);
            }
            k = 0;
            check = 0;
        }
    }
}

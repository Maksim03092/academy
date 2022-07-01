package by.academy.homework.other.String;

import java.util.Scanner;

public class Task2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите слова: ");
        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++ ) {
                if (words[i].length() > words[j].length()) {
                    String tn = words[i];
                    words[i] = words[j];
                    words[j] = tn;
                }
            }
        }
        for (int i = 0; i < words.length; i++){
            System.out.print(words[i] + "\t");
        }
    }
}

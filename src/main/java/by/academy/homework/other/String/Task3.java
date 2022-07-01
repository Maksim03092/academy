package by.academy.homework.other.String;

import java.util.Scanner;

public class Task3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Введите слова: ");
        String[] words = scanner.nextLine().split(" ");
        double sum = 0;


        for (int  i = 0; i < words.length; i++){
            sum += words[i].length();
        }
        for (int i = 0; i < words.length; i++){
            if (words[i].length() > sum / words.length){
                System.out.println(words[i] + " " + words[i].length());
            }
        }
    }
}

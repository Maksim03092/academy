package by.academy.homework.other.String;

import java.util.Scanner;
import java.util.SortedSet;

public class Task1 {

    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите слова");
        String[] words = scanner.nextLine().split(" ");

        int max = 0, min = 0, indexForMax = 0, indexForMin = 0;
        boolean forMax = true, forMin = true;

        for (int i = 0; i < words.length; i++){
            if (forMax == true || max < words[i].length()){
                max = words[i].length();
                forMax = false;
                indexForMax = i;
            }
            if ( forMin == true || min > words[i].length()){
                min = words[i].length();
                forMin = false;
                indexForMin = i;
            }
        }
        System.out.println("Самое длинное слово: " + words[indexForMax]);
        System.out.println("Самое короткое слово: " + words[indexForMin]);
    }
}

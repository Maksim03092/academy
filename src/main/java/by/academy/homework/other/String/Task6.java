package by.academy.homework.other.String;

import java.util.Scanner;

public class Task6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int max = 0;
        boolean forMax = true, check = true;
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово: ");
            words[i] = scanner.next();
        }

        for (int i = 0; i < n ; i++){
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (forMax == true || max < word.charAt(j)){
                    max = word.charAt(j);
                    forMax = false;
                }
                else {
                    check = false;
                }
            }
            if (check == true){
                System.out.println(word);
                break;
            }
            check =true;
            forMax = true;
        }
    }
}

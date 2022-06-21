package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        byte[] symbol = new byte[127];
        byte i = 0, c = 0;
        boolean check = true;
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        if (word1.length() != word2.length()){
            System.out.println("false");
        }
        else {
            for (byte j = 0; j < symbol.length; j++){
                if (j == word1.charAt(i)){
                    symbol[j]++;
                    if (i<word1.length()-1)
                    i++;
                }
                if (j == word2.charAt(c)){
                    symbol[j]--;
                    if (c<word2.length()-1)
                    c++;
                }
            }
        }
        for (byte j = 0; j < symbol.length; j++){
            if (symbol[j] != 0){
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}

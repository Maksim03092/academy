package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        System.out.print("Введите текст: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == ' '){
                continue;
            }
            if (!map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), 0);
            }
            map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
        }
        System.out.println(map);
    }
}

package by.academy.homework2;

import java.util.Scanner;

public class Task4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] suit = {"Буба", "Пика", "Крести", "Чирва"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int size = suit.length * rank.length;

        String[] deck = new String[size];

        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i * rank.length + j] = suit[i] + " " + rank[j];
            }
        }

        for (int i = 0; i < size; i++) {
            int indexRandom = (int) (Math.random() * size);
            String wordRandom = deck[indexRandom];
            deck[indexRandom] = deck[i];
            deck[i] = wordRandom;
        }

        for (int i = 0; i < numberOfPlayers * 5; i++) {
            if (i % 5 == 0){
                System.out.print("\nКарты " + (i / 5 + 1) + "-ого игрока: ");
            }
            System.out.print(deck[i]+ "    ");
        }
    }
}

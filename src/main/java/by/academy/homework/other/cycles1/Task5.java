package by.academy.homework.other.cycles1;

import java.util.Scanner;

public class Task5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите операцию, которую вы хотите совершить.");
        System.out.println("Введите 1 если вы хотите перевести саженей в метры\n" +
                "Введите 2 если вы хотите перевести дюймы в сантиметры\n" +
                "Введите 3 если вы хотите перевести футы в метры\n" +
                "Введите 4 если вы хотите перевести драхм в граммы\n" +
                "Введите 5 если хотите перевести унций в граммы\n" +
                "Введите 6 если хотите перевести фунты в килограммы\n" +
                "Введите 7 если хотите перевести аршины в метры\n" +
                "Введите 8 если хотите перевести золотников в граммы\n" +
                "Введите 9 есди хотите перевести дюймы в миллиметры\n");
        int operation = scanner.nextInt();
        scanner.close();

        double translate = 0;

        switch (operation){
            case 1:
                translate = 2.1336;
                break;
            case 2:
                translate = 2.5;
                break;
            case 3:
                translate = 0.3048;
                break;
            case  4:
                translate = 3.7325;
                break;
            case 5:
                translate = 29.86;
                break;
            case 6:
                translate = 0.40951;
                break;
            case 7:
                translate = 0.7112;
                break;
            case 8:
                translate = 4.2657;
                break;
            case 9:
                translate = 25.3995;
                break;
            default:
                System.out.println("Я не знаю такую операцию");
                break;
        }
        for (int i = 1; i <= 10; i++){
            System.out.print(i * translate + "\t");
        }
    }
}

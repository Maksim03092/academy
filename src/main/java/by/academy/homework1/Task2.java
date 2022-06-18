package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String dataType;

        System.out.print("Введите тип данных: ");
        Scanner in = new Scanner(System.in);

        dataType = in.next();

        switch (dataType){
            case "int" :
                System.out.print("Введите целое число: ");
                int value1 = in.nextInt();
                System.out.println(value1 % 2);
                break;
            case "double" :
                System.out.print("Введите дробное число: ");
                double value2 = in.nextDouble();
                System.out.println(value2 * 0.7);
                break;
            case "float" :
                System.out.print("Введите дробное число: ");
                float value3 = in.nextFloat();
                System.out.println(value3 * value3);
                break;
            case "char" :
                System.out.print("Введите символ: ");
                String value4 = in.next();
                System.out.println(value4.charAt(0));
                break;
            case "String" :
                System.out.print("Введите слово: ");
                String value5 = in.next();
                System.out.println("Hello"+ value5);
                break;
            default:
                System.out.println("Unsupported type");
        }
    }
}

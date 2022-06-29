package by.academy.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

    public static void main(String[] args) {

        String text = "Version: Java 5, Java 6, Java 7, Java 8, Java 12";
        Pattern pattern = Pattern.compile("Java\s[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпаление: " + text.substring(start,end));
        }
    }
}

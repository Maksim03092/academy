package by.academy.lesson12.classwork;

import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {

        Seasons seasons = Seasons.SPRING;

        seasons.print(seasons);
        System.out.println(seasons.getDiscription());

        for (Seasons element : Seasons.values()){
            System.out.println(element + "\t" + element.getTemperature() + "\t" + element.getDiscription());
        }
    }
}

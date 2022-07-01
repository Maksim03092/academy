package by.academy.homework.other.cycles1;

public class Task23 {

    public static void main(String[] args) {

        int sum = 1, value = 1;

        for (int i = 1; i <= 10; i ++){

            value *= 2;
            sum += value;
            System.out.println(value + "\t" + sum);
        }
        System.out.println(sum);
    }
}

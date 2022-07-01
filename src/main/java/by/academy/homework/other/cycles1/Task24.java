package by.academy.homework.other.cycles1;

public class Task24 {

    public static void main(String[] args) {

        int value = 1;
        long sum = 1;

        for (int i = 2; i <= 10; i++){
                value += i;
                sum *= value;
            System.out.println(i + " " + value + " " + sum);
        }
    }
}

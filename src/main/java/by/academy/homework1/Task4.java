package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {

        int value = 1;

        while (value < 1_000_000){
            if (value == 1) {
                System.out.println(value);
                value *= 2;
            }
            else {
                System.out.println(value);
                value *= 2;
            }
        }
    }
}

package by.academy.homework.other.cycles;

public class Task7 {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 10);
        int sum = 1;

        if (number == 0)
        {
            System.out.println("1");
        }
        for (int i = 1; i <= number; i++){
            sum *= i ;
        }
        System.out.println(number);
        System.out.println(sum);
    }
}

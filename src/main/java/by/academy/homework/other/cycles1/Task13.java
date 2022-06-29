package by.academy.homework.other.cycles1;

public class Task13 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 100; i < 200; i++){
            if (i % 17 == 0){
                System.out.print(i + "\t");
                sum += i;
            }
        }
        System.out.println("\n" + sum);
    }
}

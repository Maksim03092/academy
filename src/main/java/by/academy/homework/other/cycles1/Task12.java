package by.academy.homework.other.cycles1;

public class Task12 {

    public static void main(String[] args) {

        int mou = 1;

        for (int i = 10; i < 100; i++){
            if (i % 2 != 0 && i % 13 == 0){
                System.out.print(i + "\t");
                mou *= i;
            }
        }
        System.out.println("\n" + mou);
    }
}

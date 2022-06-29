package by.academy.homework.other.cycles;

public class Task6 {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            i++;
        }
        while (i < 100);
    }
}
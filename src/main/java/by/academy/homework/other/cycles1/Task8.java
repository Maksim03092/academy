package by.academy.homework.other.cycles1;

public class Task8 {

    public static void main(String[] args) {

        for (int i = 20; i < 50; i++){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.print(i + "\t");
            }
        }
    }
}

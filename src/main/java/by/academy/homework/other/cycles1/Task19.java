package by.academy.homework.other.cycles1;

public class Task19 {

    public static void main(String[] args) {

        for (int i = 10; i < 100; i++){
            for (int j = 10; j < 100; j++){
                int number = i * 100 + j;
                if (number % (i * j) == 0){
                    System.out.print(number + "\t");
                }
            }
        }
    }
}

package by.academy.homework.other.arrays1;

public class Task0 {

    public static void main(String[] args) {

        int [] array = new int[10];
        int j = 0;
        for (int i = 2; i <= 20; i++){
            if (i % 2 == 0){
                array[j] = i;
                j++;
            }
        }
        for (int i =0; i < array.length; i++ ) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
        for (int i =0; i < array.length; i++ ) {
            System.out.print(array[i] + "\n");
        }
    }
}

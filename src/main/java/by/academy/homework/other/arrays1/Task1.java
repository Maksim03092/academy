package by.academy.homework.other.arrays1;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[50];
        int j = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                array[j] = i;
                j++;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 49; i >= 0; i--){
            System.out.print(array[i] + "\t");
        }
    }
}

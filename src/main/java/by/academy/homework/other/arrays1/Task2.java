package by.academy.homework.other.arrays1;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[15];
        int k = 0;

        for (int i = 0; i <array.length; i++){
            array[i] = (int) (Math.random()*10);
            if (array[i] % 2 == 0){
                k++;
            }
        }
        for (int element : array){
            System.out.print(element + "\t");
        }
        System.out.println("\n" + k);
    }
}

package by.academy.homework.other.arrays1;

public class Task9 {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int k = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 9) + 1;
            array2[i] = (int) (Math.random() * 9) + 1;
            array3[i] = (double) array1[i] / array2[i];
            if (array3[i] % 1 == 0){
                k++;
            }
        }
        for (int element : array1){
            System.out.print(element + "\t");
        }
        System.out.println("\n");
        for (int element : array2){
            System.out.print(element + "\t");
        }
        System.out.println("\n");
        for (double element : array3){
            System.out.print(element + "\t");
        }
        System.out.println("\n");
        System.out.println(k);
    }
}

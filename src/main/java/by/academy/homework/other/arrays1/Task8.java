package by.academy.homework.other.arrays1;

public class Task8 {

    public static void main(String[] args) {

        int[] array = new int[12];
        int max = 0, index = 0;
        boolean check = true;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 31) - 15;
            if (check == true || max <= array[i]){
                max = array[i];
                index = i;
                check = false;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n" + index);
    }
}

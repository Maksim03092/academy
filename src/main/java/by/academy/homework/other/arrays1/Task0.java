package by.academy.homework.other.arrays1;

public class Task0 {

    public static void main(String[] args) {

        int [] array = new int[8];

        for (int i = 2; i < 20; i++){
            int j = 0;
            if (i % 2 == 0){
                array[j] = i;
                j++;
            }
        }
        for (int i =0; i < array.length; i++ ) {
            System.out.println(array[i] + "\t");
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]+"\n");
        }
    }
}

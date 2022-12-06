package by.academy.homework5;

public class Task6 {

    public static void main(String[] args) {

        int[] array = new int[8];

        try {
            for (int i = 0; i < array.length + 2; i++) {
                array[i] = i;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is to small, expand the array");
        }

    }
}

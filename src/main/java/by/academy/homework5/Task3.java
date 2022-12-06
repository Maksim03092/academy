package by.academy.homework5;

import java.util.Iterator;

public class Task3<T> implements Iterator<T> {

    private final T[][] array;
    private int i, j;

    public Task3(T[][] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (j == 0){
            System.out.println();
        }
        return i < array.length;
    }

    @Override
    public T next() {

        T element = array[i][j++];

        if (j >= array[i].length){
            i++;
            j = 0;
        }
        return element;
    }

    public static void main(String[] args) {

        Integer[][] array = new Integer[4][4];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = i;
            }
        }

        Task3<Integer> task3 = new Task3<>(array);

        while (task3.hasNext()){
            System.out.print(task3.next());
        }
    }
}

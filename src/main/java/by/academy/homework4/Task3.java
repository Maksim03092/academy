package by.academy.homework4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;

public class Task3<T> {

    private T[] array;
    private int i;

    public Task3(){
        this.array = (T[]) new Object[16];
    }

    public Task3(int arraySize){
        this.array = (T[]) new Object[arraySize];
    }

    public void grow(){
        int newLength = (int)(array.length * 1.5);
        T[] newArray = (T[]) new Object[newLength];
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }

    public void add(T obj){
        if (i == array.length){
            grow();
        }
        array[i] = obj;
        i++;
    }

    public void get(int i){
        if (this.i > i) {
            System.out.println(array[i]);
        }
        else {
            System.out.println("Опреация невозможна.");
        }
    }

    public void getLast(){
        System.out.println(array[i - 1]);
    }

    public void getFirst(){
        System.out.println(array[0]);
    }

    public void getSize(){
        System.out.println(i);
    }

    public void getLastIndex(){
        System.out.println(i - 1);
    }

    public void removeElement (int i) {
        if (this.i > i) {
            array[i] = null;
            for (int j = i; j < this.i - 1; j++) {
                T element = array[j + 1];
                array[j + 1] = array[j];
                array[j] = element;
            }
        }
        this.i--;
    }

    public void removeElement (T obj) {
        boolean check = true;
        for (int j = 0; j < this.i; j++){
            if (array[j].equals(obj)){
                array[j] = null;
                for(int c = j; c < this.i - 1; c++){
                    T element = array[c + 1];
                    array[c + 1] = array[c];
                    array[c] = element;
                }
                this.i--;
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Элемента: " + obj + " в массиве нет");
        }
    }

    public <T> Iterator<T> getIterator (Task3<T> obj){
        return new Iterator<T>() {
            private int count = obj.i;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                return obj.array[index++];
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task3<?> task3 = (Task3<?>) o;
        return i == task3.i && Arrays.equals(array, task3.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(i);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "Task3{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

class Test{

    public static void main(String[] args) {

        Task3<String> task3 = new Task3(2);
        task3.add("I");
        task3.add("Maxim");
        task3.add("ME");
        task3.getLast();
        task3.getFirst();

        Iterator<String> iterator = task3.getIterator(task3);

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}

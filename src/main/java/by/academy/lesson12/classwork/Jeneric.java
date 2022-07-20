package by.academy.lesson12.classwork;

import javax.swing.*;

public class Jeneric<T> {
    private T[] item;

    @SuppressWarnings("Unchecked")
    public Jeneric(){
        super();
        this.item = (T[]) new Object[10];
    }

    public Jeneric(T[] item){
        this.item = item;
    }

    public T[] getItems() {
        return item;
    }

    public void setItems(T[] items) {
        this.item = items;
    }
}

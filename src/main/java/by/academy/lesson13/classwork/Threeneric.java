package by.academy.lesson13.classwork;

import by.academy.lesson2.classwork.Cat;

import java.io.Serializable;

public class Threeneric<T extends Comparable<T>, V extends Cat & Serializable, C extends Number> {
    private T tVariable;
    private V vVariable;
    private C cVariable;

    public Threeneric(T tVariable, V vVariable, C cVariable) {
        this.tVariable = tVariable;
        this.vVariable = vVariable;
        this.cVariable = cVariable;
    }

    public void printTVariable(){
        System.out.println(tVariable.getClass());
    }
    public void printVVariable(){
        System.out.println(vVariable.getClass());
    }
    public void printCVariable(){
        System.out.println(cVariable.getClass());
    }

    public T gettVariable() {
        return tVariable;
    }

    public void settVariable(T tVariable) {
        this.tVariable = tVariable;
    }

    public V getvVariable() {
        return vVariable;
    }

    public void setvVariable(V vVariable) {
        this.vVariable = vVariable;
    }

    public C getcVariable() {
        return cVariable;
    }

    public void setcVariable(C cVariable) {
        this.cVariable = cVariable;
    }
}

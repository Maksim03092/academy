package by.academy.lesson12.classwork;

public enum CoffeeSize {

    BIG(100,"B"), HUGE(200, "H"), OVERWHELMING(300, "O"), SMALL(500, "S");

    private final int m1;
    private final String alias;

    CoffeeSize(int m1, String alias){
        this.m1 = m1;
        this.alias = alias;
    }

    public int getM1(){
        return m1;
    }

    public String getAlias(){
        return alias;
    }
}

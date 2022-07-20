package by.academy.lesson12.classwork;

public enum Seasons {
    SUMMER(15){
        @Override
        public String getDiscription() {
            return "Тёплое время года";
        }
    },
    WINTER(0), AUTUMN(5), SPRING(10);

    private double temperature;

    Seasons (double temperature){
        this.temperature = temperature;
    }

    public String getDiscription(){
        return "Холодное время года";
    }

    public double getTemperature(){
        return temperature;
    }

    public void print (Seasons seasons){
        switch (seasons){
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            default:
                break;
        }
    }
}

package by.academy.homework.other.operators;

public class Task4 {
    public static void main(String[] args) {

        int s = 370_000, sec, m, min, h, hour, day, d, week, w,mon, month, year;

        sec = s % 60;

        m = (s - sec) / 60;

        min = m % 60;

        h = (m - min) / 60;

        hour = h % 24;

        d = (h - hour) / 24;

        day = d % 7;

        w = (d - day) / 7;

        week = w % 4;

        mon = (w - week) / 4;

        month = mon % 12;

        year = (mon - month) / 12;


        System.out.println(year + " лет " + month + " месяца " + week + " недели " + day + " дня " + hour + " часа " + min + " минут " + sec + " секунд");

    }
}

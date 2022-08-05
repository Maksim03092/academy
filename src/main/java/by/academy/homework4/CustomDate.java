package by.academy.homework4;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class CustomDate {

    private static final Scanner scanner = new Scanner(System.in);
    private Day day;
    private Month month;
    private Year year;

    public CustomDate(int day, int month, int year) {

        this.day = this.new Day(day);
        this.month = this.new Month(month);
        this.year = this.new Year(year);

    }

    public CustomDate(String localDate) {

        this.day = this.new Day(Integer.parseInt(localDate.substring(0, 2)));
        this.month = this.new Month(Integer.parseInt(localDate.substring(3, 5)));
        this.year = this.new Year(Integer.parseInt(localDate.substring(6, 10)));

    }

    class Day {

        int day;

        public Day(int day) {
            this.day = day;
        }

        public enum DayOfWeek {
            SUNDAY("Sunday", 1), MONDAY("Monday", 2), TUESDAY("Tuesday", 3),
            WEDNESDAY("Wednesday", 4), THURSDAY("Thursday", 5), FRIDAY("Friday", 6),
            SATURDAY("Saturday",7);

            private final String nameDay;
            private final int numberDay;

            DayOfWeek(String nameDay, int numberDay) {
                this.nameDay = nameDay;
                this.numberDay = numberDay;
            }

            public int getNumberDay() {
                return numberDay;
            }

            public String getNameDay() {
                return nameDay;
            }
        }

        public void getDayName(){
            LocalDate localDate = LocalDate.of(year.year, month.month, day);
            for (Day.DayOfWeek element : Day.DayOfWeek.values()){
                if (element.numberDay == localDate.getDayOfWeek().getValue()){
                    System.out.println(element.nameDay);
                }
            }
        }
    }

    class Month {

        int month;

        public Month(int month) {
            this.month = month;
        }

        public int getDayInMonth(int month, Year year, int year2 ){

            int day = 0;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                case 2:
                    if (year.checkLeapYear(year2)) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;

            }
            return day;
        }
    }

    class Year {

        int year;

        public Year(int year) {
            this.year = year;
        }

        public boolean checkLeapYear(){
            if(year % 4 == 0 && year % 100 != 0){
                System.out.println("Год високосный");
                return true;
            }
            else{
                if (year % 400 == 0){
                    System.out.println("Год високосный");
                    return true;
                }
                else{
                    System.out.println("Год обычный");
                    return false;
                }
            }
        }
        public boolean checkLeapYear(int i){
            if(i % 4 == 0 && i % 100 != 0){
                return true;
            }
            else{
                if (i % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }

    public Day getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public Year getYear() {
        return year;
    }

    public void setLocalDate(){
        while (true) {
            System.out.print("Введите дату: ");
            String date = scanner.next();
            if (DateValidator.checkDate1(date)) {
                this.day.day = (Integer.parseInt(date.substring(0, 2)));
                this.month.month = (Integer.parseInt(date.substring(3, 5)));
                this.year.year = (Integer.parseInt(date.substring(6, 10)));
                break;
            }
            else{
                System.out.println("Вы неправильно ввели дату. Повторите попытку.");
            }
        }
    }
    public void numberOfDaysInInterval(){
        int day;
        int month;
        int year;
        int numberDate1 = 0;
        int numberDate2 = 0;
        while (true) {
            System.out.print("Введите вторую дату: ");
            String date2 = scanner.next();
            if (DateValidator.checkDate1(date2)){
                day = (Integer.parseInt(date2.substring(0, 2)));
                month = (Integer.parseInt(date2.substring(3, 5)));
                year = (Integer.parseInt(date2.substring(6, 10)));
                break;
            }
            else {
                System.out.println("Вы непрвильно ввели дату. Повторите попытку.");
            }
        }
        for (int i = 1; i < this.year.year; i++){
            if (this.year.checkLeapYear(i)) {
                numberDate1 += 366;
            }
            else {
                numberDate1 += 365;
            }
        }
        for (int i = 1; i < this.month.month; i++){
            numberDate1 += this.month.getDayInMonth(i, this.year, this.year.year);
        }

        numberDate1 += this.day.day;

        for (int i = 1; i < year; i++){
            if (this.year.checkLeapYear(i)) {
                numberDate2 += 366;
            }
            else {
                numberDate2 += 365;
            }
        }
        for (int i = 1; i < month; i++){
            numberDate2 += this.month.getDayInMonth(i, this.year, year);
        }

        numberDate2 += day;

        if (numberDate1 > numberDate2){
            System.out.println("Временной промежуток составит: " + (numberDate1 - numberDate2) + " д.");
        }
        else if (numberDate2 > numberDate1 ){
            System.out.println("Временной промежуток составит: " + (numberDate2 - numberDate1) + " д.");
        }
        else {
            System.out.println("Даты равны");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDate that = (CustomDate) o;
        return Objects.equals(day.day, that.day.day) && Objects.equals(month.month, that.month.month) && Objects.equals(year.year, that.year.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day.day, month.month, year.year);
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "day=" + day.day +
                ", month=" + month.month +
                ", year=" + year.year +
                '}';
    }
}

class TestCustomDate{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        CustomDate customDate;

        while (true){
            System.out.print("Введите 1 если хотите ввести дату строкой, 2 если хотите вести цифрами: ");
            int i = scanner.nextInt();
            if (i == 1){
                while (true) {
                    System.out.print("Введите дату: ");
                    String date = scanner.next();
                    if (DateValidator.checkDate1(date)){
                        customDate = new CustomDate(date);
                        break;
                    }
                    else {
                        System.out.println("Вы ввели неправильно дату. Повторите попытку.");
                    }
                }
            }
            else if (i == 2){
                int day;
                int checkDay = 0;
                int month;
                int year;
                while (true){
                    while (true){
                        System.out.print("Введите год: ");
                        year = scanner.nextInt();
                        if (year > 0 && year < 2022){
                            break;
                        }
                        else {
                            System.out.println("Вы ввели неправильно год. Повторите попытку");
                        }
                    }
                    while (true) {
                        System.out.print("Введите месяц: ");
                        month = scanner.nextInt();
                        if (month >= 1 && month <= 12) {
                            switch (month) {
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                    checkDay = 31;
                                    break;
                                case 2:
                                    if(year % 4 == 0 && year % 100 != 0){
                                        checkDay = 29;
                                    }
                                    else{
                                        if (year % 400 == 0){
                                            checkDay = 29;
                                        }
                                        else{
                                            checkDay = 28;
                                        }
                                    }
                                    break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                    checkDay = 30;
                                    break;

                            }
                            break;
                        }
                        else {
                            System.out.println("Вы ввели неправильно месяц. Повторите попытку.");
                        }
                    }
                    while (true){
                        System.out.print("Введите день: ");
                        day = scanner.nextInt();

                        if (day >= 1 && day <= checkDay){
                            break;
                        }
                        else {
                            System.out.println("Вы ввели неправильно день. Повторите попытку.");
                        }
                    }
                    customDate = new CustomDate(day,month,year);
                    break;
                }
            }
            else {
                System.out.println("Я не знаю такого значеия. Повторите попытку.");
                continue;
            }
            break;
        }
        customDate.getYear().checkLeapYear();
        customDate.getDay().getDayName();
        customDate.numberOfDaysInInterval();
    }
}

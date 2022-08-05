package by.academy.homework4;

import java.util.regex.Pattern;

public class DateValidator {

    private static final Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])\\-(0[1-9]|1[012])\\-((19[4-9][0-9])|(20[0,1][0-9])|(202[0-2]))");

    public static boolean checkDate1(String date) {

        return pattern.matcher(date).matches();

    }
}

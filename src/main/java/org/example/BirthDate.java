package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class BirthDate {

    public static String dateFormattingFromLocalDate(LocalDate dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateFormat = formatter.format(dateOfBirth);
        return dateFormat;
    }

    public static int getAge(LocalDate dateOfBirth) {
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(dateOfBirth, dateNow);
        int age = period.getYears();
        return age;
    }

    public static String getBirthdayWeekDay(LocalDate dateOfBirth) {
        DayOfWeek day = dateOfBirth.getDayOfWeek();
        String str = day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return str;
    }

    public static int getBirthdayWeekInYear(LocalDate dateOfBirth) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = dateOfBirth.get(weekFields.weekOfWeekBasedYear());
        return weekNumber;
    }
}

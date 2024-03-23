package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class BirthDateTest {

    @Test
    void mustDateFormattingFromLocalDate() {
        //given
        LocalDate dateOfBirth = LocalDate.of(1997, 06, 19);
        String excepted = "1997-06-19";

        //when
        String result = BirthDate.dateFormattingFromLocalDate(dateOfBirth);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void mustGetAge() {
        //given
        LocalDate dateOfBirth = LocalDate.of(1997, 06, 19);
        int excepted = 26;

        //when
        int result = BirthDate.getAge(dateOfBirth);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void mustGetBirthdayWeekDay() {
        //given
        LocalDate dateOfBirth = LocalDate.of(1997, 06, 19);
        String excepted = "Thursday";

        //when
        String result = BirthDate.getBirthdayWeekDay(dateOfBirth);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void mustGetBirthdayWeekInYear() {
        //given
        LocalDate dateOfBirth = LocalDate.of(1997, 06, 19);
        int excepted = 25;

        //when
        int result = BirthDate.getBirthdayWeekInYear(dateOfBirth);

        //then
        Assertions.assertEquals(excepted, result);
    }
}

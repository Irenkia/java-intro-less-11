package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificationPESELTest {

    @Test
    void checkNumberOfDigitsInPESEL() {
        //given
        String pesel = "12345678912";
        boolean excepted = true;

        //when
        boolean result = VerificationPESEL.checkNumberOfDigitsInPESEL(pesel);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void checkNumberOfDigitsInPESEL_whenWrongNumberOfDigits() {
        //given
        String pesel = "1234567891234567";
        boolean excepted = false;

        //when
        boolean result = VerificationPESEL.checkNumberOfDigitsInPESEL(pesel);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void checkNumberOfDigitsInPESEL_whenThereAreLetters() {
        //given
        String pesel = "1a345678912";
        boolean excepted = false;

        //when
        boolean result = VerificationPESEL.checkNumberOfDigitsInPESEL(pesel);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void checkNumberOfDigitsInPESEL_whenThereAreOtherSymbols() {
        //given
        String pesel = "1 345678912";
        boolean excepted = false;

        //when
        boolean result = VerificationPESEL.checkNumberOfDigitsInPESEL(pesel);

        //then
        Assertions.assertEquals(excepted, result);
    }
}

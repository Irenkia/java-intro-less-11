package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificationURLTest {

    @Test
    void checkURLOneExample () {
        //given
        String url = "http://www.onet.pl";
        boolean excepted = true;

        //when
        boolean result = VerificationURL.checkURL(url);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void checkURLTwoExample () {
        //given
        String url = "https://mail.google.com";
        boolean excepted = true;

        //when
        boolean result = VerificationURL.checkURL(url);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void checkURLThreeExample () {
        //given
        String url = "http://wiadmosci.onet.pl";
        boolean excepted = true;

        //when
        boolean result = VerificationURL.checkURL(url);

        //then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    void checkURLFourExample () {
        //given
        String url = "http://onet.pl";
        boolean excepted = true;

        //when
        boolean result = VerificationURL.checkURL(url);

        //then
        Assertions.assertEquals(excepted, result);
    }
}
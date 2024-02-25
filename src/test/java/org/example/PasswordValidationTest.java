package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PasswordValidationTest {

    @Test
    void mustCheckPasswordValid() {
        //given
        String[] passwords = {"jyDaDy1", "ssfttR113", "TTdjsd567", "dfdf975fgYY"};
        boolean excepted = true;

        //when
        for(String password : passwords){
            boolean result = PasswordValidation.checkPassword(password);
            System.out.println("Password \"" + password + "\" is valid : " + result);

            //then
            Assertions.assertEquals(excepted, result);
        }
    }

    @Test
    void mustCheckPasswordInvalid() {
        //given
        String[] passwords = {"jyD1", "jrdkd23", "fjdkflg", "hjTsdcv", "sffaRs21", "sffaRs2021"};
        boolean excepted = false;

        //when
        for(String password : passwords){
            boolean result = PasswordValidation.checkPassword(password);
            System.out.println("Password \"" + password + "\" is valid : " + result);

            //then
            Assertions.assertEquals(excepted, result);
        }
    }
}
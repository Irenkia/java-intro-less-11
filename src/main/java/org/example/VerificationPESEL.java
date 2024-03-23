package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificationPESEL {
    public static boolean checkNumberOfDigitsInPESEL(String pesel) {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }

}

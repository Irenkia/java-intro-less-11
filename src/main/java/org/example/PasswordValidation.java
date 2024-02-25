package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[A-Z])(?!.*2[01]).{7,})");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

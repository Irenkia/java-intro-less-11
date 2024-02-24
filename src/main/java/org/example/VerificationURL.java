package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificationURL {
    public static boolean checkURL(String url) {
        Pattern pattern = Pattern.compile("^(https?://)(www.)?[a-z]{3,9}\\.[a-z]{2,6}(.[a-z]{2,3})?");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}

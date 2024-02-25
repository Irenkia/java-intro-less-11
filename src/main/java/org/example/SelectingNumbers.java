package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectingNumbers {

    public static void selectionIntegersFromText(String text) {
        Pattern pattern = Pattern.compile("(?:\\s|^)\\d+(?=\\s|$)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void selectionDoublesFromText(String text) {
        Pattern pattern = Pattern.compile("\\b\\d\\.\\d+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void selectionNumbersInExponentialNotationFromText(String text) {
        Pattern pattern = Pattern.compile("\\b\\d\\.\\d+[a-zA-Z]\\+?\\-?\\d{2}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}

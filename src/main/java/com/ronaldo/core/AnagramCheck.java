package com.ronaldo.core;

import java.util.Arrays;
import java.util.Objects;

public class AnagramCheck {

    private String removeBlanks (String str){
        return str.replaceAll("\\s", "");
    }

    private boolean isAlphanumeric (String str) {return str.matches("^.*[^a-zA-Z0-9 ].*$");}

    private boolean checkAnagramConditions (String str) {
       return isAlphanumeric(str) || str.isBlank();
    }

    private String nullCheck (String str) {
        return Objects.requireNonNull(str, "Provide a non null value");
    }

    private String prettyAnagram (String str) {
        return removeBlanks(str).toLowerCase();
    }

    boolean isAnagram (String str1, String str2){
        String str1Adjusted = prettyAnagram(nullCheck(str1));
        String str2Adjusted = prettyAnagram(nullCheck(str2));

        if (checkAnagramConditions(str1Adjusted)
                  || checkAnagramConditions(str2Adjusted)
                  || str1Adjusted.length() != str2Adjusted.length()) {
            return false;
        }

        char [] str1Char = str1Adjusted.toCharArray();
        char [] str2Char = str2Adjusted.toCharArray();

        Arrays.sort(str1Char);
        Arrays.sort(str2Char);

        String str1Sorted = new String(str1Char);
        String str2Sorted = new String(str2Char);

        return str1Sorted.equals(str2Sorted);
    }

}


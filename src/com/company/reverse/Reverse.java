package com.company.reverse;


public class Reverse {
    private static final String MATCH_ALL_DIGITS = "[\\d+]";
    private static final String STRING_REGEX = "";

    public String ActionOfReversing(String stringToReverse) {
        StringBuilder reverseString = new StringBuilder(stringToReverse.replaceAll(MATCH_ALL_DIGITS, STRING_REGEX)).reverse();
        for (int indexOfSymbols = 0; indexOfSymbols < stringToReverse.length(); indexOfSymbols++) {
            if (!Character.isLetter(stringToReverse.charAt(indexOfSymbols))) {
                reverseString.insert(indexOfSymbols, stringToReverse.charAt(indexOfSymbols));
            }
        }
        return reverseString.toString();
    }
}
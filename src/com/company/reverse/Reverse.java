package com.company.reverse;


public class Reverse {
    private static final String MATCH_ALL_DIGITS = "[\\d+]";
    private static final String EMPTY = "";

    public String ActionOfReversing(String stringToReverse) {
        StringBuilder reverseString = new StringBuilder(stringToReverse.replaceAll(MATCH_ALL_DIGITS, EMPTY)).reverse();
        for (int indexOfSymbols = 0; indexOfSymbols < stringToReverse.length(); indexOfSymbols++) {
            if (!Character.isLetter(stringToReverse.charAt(indexOfSymbols))) {
                reverseString.insert(indexOfSymbols, stringToReverse.charAt(indexOfSymbols));
            }
        }
        return reverseString.toString();
    }
}
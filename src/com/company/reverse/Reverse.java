package com.company.reverse;


public class Reverse {

    static final String ALL_DIGITS_IN_STRING = "[\\d+]";
    static final String STRING_REGEX = "";

    public String reverse(String stringToReverse) {


        StringBuilder reverseString = new StringBuilder(stringToReverse.replaceAll(ALL_DIGITS_IN_STRING, STRING_REGEX)).reverse();

        for (int indexOfSymbols = 0; indexOfSymbols < stringToReverse.length(); indexOfSymbols++) {
            if (!Character.isLetter(stringToReverse.charAt(indexOfSymbols))) {
                reverseString.insert(indexOfSymbols, stringToReverse.charAt(indexOfSymbols));
            }
        }
        return reverseString.toString();

    }


}
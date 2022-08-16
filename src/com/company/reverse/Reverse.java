package com.company.reverse;


public class Reverse {
    private static final String MATCH_ALL_EXCEPT_UNICODE_LETTERS = "[^\\p{L}]+";
    private static final String EMPTY = "";

    public String getReversed(String stringToReverse) { //как тестировать эксепшены
        if (stringToReverse == null) {

            throw new IllegalArgumentException();
                
        }
        StringBuilder reverseString = new StringBuilder(stringToReverse.replaceAll(MATCH_ALL_EXCEPT_UNICODE_LETTERS, EMPTY)).reverse();//обнаруживать пробелы,изменить рег вражение
        for (int indexOfSymbols = 0; indexOfSymbols < stringToReverse.length(); indexOfSymbols++) {
            if (!Character.isLetter(stringToReverse.charAt(indexOfSymbols))) {
                reverseString.insert(indexOfSymbols, stringToReverse.charAt(indexOfSymbols));
            }
        }
        return reverseString.toString();
    }
}
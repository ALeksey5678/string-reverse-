package com.company.reverse;

public class Reverse {
    public static void main(String[] args) {


        System.out.println(reverse("ad12fgiu57"));
    }

    private static String reverse(String string) {
        StringBuilder reverseString = new StringBuilder(string.replaceAll("[\\d+]", "")).reverse();

        for (int numOfSymbols   = 0; numOfSymbols < string.length(); numOfSymbols++) {
            if (!Character.isLetter(string.charAt(numOfSymbols))) {
                reverseString.insert(numOfSymbols, string.charAt(numOfSymbols));
            }
        }
        return reverseString.toString();

    }
}

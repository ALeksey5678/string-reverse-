package com.company.reverse;

public class Reverse {
    public static void main(String[] args) {


        System.out.println(reverse("ad12fgiu57"));
    }

    private static String reverse(String s) {
        StringBuilder result = new StringBuilder(s.replaceAll("[\\d+]", "")).reverse();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                result.insert(i, s.charAt(i));
            }
        }
        return result.toString();

    }
}

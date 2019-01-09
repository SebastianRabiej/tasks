package com.szkolenie.zadania;

//https://pl.wikipedia.org/wiki/Palindrom
class PalindromeChecker {

    public static boolean checkIsPalindrome(String possiblePalindrome) {
        if(possiblePalindrome == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < possiblePalindrome.length(); i++) {
            if (possiblePalindrome.charAt(i) != possiblePalindrome.charAt(possiblePalindrome.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

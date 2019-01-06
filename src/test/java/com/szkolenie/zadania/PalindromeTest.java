package com.szkolenie.zadania;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PalindromeTest {

    @Test
    public void check_is_palindrome_should_be_false(){
        //when
        boolean result = PalindromeChecker.checkIsPalindrome("VALUE");

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void check_is_palindrome(){
        //when
        boolean result = PalindromeChecker.checkIsPalindrome("ALA");

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void check_is_palindrome_should_throw_exception(){
        assertThrows(IllegalArgumentException.class, ()-> PalindromeChecker.checkIsPalindrome(null));
    }
}

package org.jegraru.mutant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    void givenAPalindrome_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome("noon"));
    }
}

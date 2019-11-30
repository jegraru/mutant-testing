package org.jegraru.mutant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    void givenAPalindrome_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome("noon"));
    }

    @Test
    void givenAnEmptyString_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome(" "));
    }

    @Test
    void givenAStringWithNonMatchingStartAndEnding_whenIsPalindrome_thenItShouldReturnFalse() {
        assertFalse(palindrome.isPalindrome("nool"));
    }

    @Test
    void givenAStringWithNonMatchingCharactersInTheMiddle_whenIsPalindrome_thenItShouldReturnFalse() {
        assertFalse(palindrome.isPalindrome("nain"));
    }

    @Test
    void givenABlankString_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome(" "));
    }

    @Test
    void givenAPalindromeWithAnOddLength_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome("nooon"));
    }

    @Test
    void givenAPalindromeWithUnbalancedSpaceAtTheBeginning_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome(" noon"));
    }

    @Test
    void givenAPalindromeWithUnbalancedSpaceAtTheEnd_whenIsPalindrome_thenItShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome("noon "));
    }
}

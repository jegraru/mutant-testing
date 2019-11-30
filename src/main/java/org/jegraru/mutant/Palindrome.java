package org.jegraru.mutant;

class Palindrome {

    boolean isPalindrome(String input) {
        String trimmed = input.trim();
        if (trimmed.length() <= 1) {
            return true;
        }
        char firstChar = trimmed.charAt(0);
        char lastChar = trimmed.charAt(trimmed.length() - 1);
        String mid = trimmed.substring(1, trimmed.length() - 1);
        return (firstChar == lastChar) && isPalindrome(mid);
    }
}

package org.jegraru.mutant;

class Palindrome {

    boolean isPalindrome(String input) {
        return _isPalindrome(input.trim());
    }

    private static boolean _isPalindrome(String input) {
        if (input.length() <= 1) {
            return true;
        }
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        String mid = input.substring(1, input.length() - 1);
        return (firstChar == lastChar) && _isPalindrome(mid);
    }
}

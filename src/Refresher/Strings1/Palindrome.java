package Refresher.Strings1;

public class Palindrome {

    public static boolean isPalindrome(char[] s, int start, int end) {
        while (start < end) {
            if (s[start] != s[end]) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] str = "radar".toCharArray();
        boolean result = isPalindrome(str, 0, str.length - 1);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}


/*
Time Complexity- O(N).
Space Complexity- O(1).
*/
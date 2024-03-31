package Refresher.Strings1;

public class longestPalindromeOptimized {

    public static int longestPalindrome(char s[]) {
        int maxLength = 0;
        int N = s.length;
        for (int c = 0; c < N; c++) {
            // Odd length string
            int left = c, right = c;
            while (left >= 0 && right < N && s[left] == s[right]) {
                left--;
                right++;
            }
            maxLength = Math.max(maxLength, right - left - 1);

            // Even length string
            left = c;
            right = c + 1;
            while (left >= 0 && right < N && s[left] == s[right]) {
                left--;
                right++;
            }
            maxLength = Math.max(maxLength, right - left - 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "babad";
        int result = longestPalindrome(input.toCharArray());
        System.out.println("Length of the longest palindrome substring: " + result);
    }
}

/*
Time Complexity- O(N^2).
Space Complexity- O(1).
*/

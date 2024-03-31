package Refresher.Strings1;

public class longestPalindromeBF {

    public static int longestPalindrome(char s[]) {
        int N = s.length;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (isPalindrome(s, i, j)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(char s[], int start, int end) {
        while (start < end) {
            if (s[start] != s[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "babad";
        int result = longestPalindrome(input.toCharArray());
        System.out.println("Length of the longest palindrome substring: " + result);
    }
}

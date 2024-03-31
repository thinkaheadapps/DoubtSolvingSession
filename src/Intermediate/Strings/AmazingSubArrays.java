package Intermediate.Strings;

public class AmazingSubArrays {

    public int solve(String A) {

        int length = A.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = A.charAt(i);

            if (isVowel(currentChar)) {
                // Number of amazing substrings starting from this vowel
                count = (count + length - i) % 10003;
            }
        }

        return count;
    }

    public static boolean isVowel(char ch) {
        // Check if the character is a vowel (case-insensitive)
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        // Create an instance of Solution
        AmazingSubArrays solution = new AmazingSubArrays();

        // Test input string
        String input = "example"; // You can change this to any string you want to test

        // Call the solve method and print the result
        int result = solution.solve(input);
        System.out.println("Number of amazing substrings: " + result);
    }

}

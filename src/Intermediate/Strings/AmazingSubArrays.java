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
        String input = "example";

        // Call the solve method and print the result
        int result = solution.solve(input);
        System.out.println("Number of amazing substrings: " + result);
    }

}

/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
 */

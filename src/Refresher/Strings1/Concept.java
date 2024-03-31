package Refresher.Strings1;

public class Concept {

    public static void main(String[] args) {

    /*
    'A' to 'Z' have ASCII from 65 to 90
    */

        char ch = (char)65;
        System.out.println(ch);


        char ch1 = 70;
        System.out.println(ch1);

      /*
      character 'A' gets printed; we are assigning Integer to Char,
      hence in some languages typecasting will be required.
      */

        int x = 'a';
        System.out.println(x);
       // System.out.println((x); //97 will be printed

      /*
      No need to typecast since we are assigning Char to Int
      (smaller data type to bigger, so it will not overflow)
      */

      /*
      Question 1 : Switch cases
      Given a string consisting of only alphabets(either lowercase or uppercase).
      Print all the characters of string in such a way that for
      all lowercase character,
      print its uppercase character and for all uppercase character,
      print its lowercase character.

      Input
      "Hello"
      Output
      "hELLO"

      aDgbHJe- AdGBhjE

      */

      /*
      The key observations are:
      Lowercase characters can be changed into uppercase by subtracting 32 from its ASCII values.
      Uppercase charactes can be changed into lowercase by adding 32 from its ASCII values.
      The above points are derived from the fact that for
      every alphabet, the difference between its ascii value
      in lowercase and uppercase is 32.
      Program for ASCII conversion - index-2
      */

      /*
      Substring

      A substring is a contiguous sequence of characters within a string.
      A substring concept in string is similar to subarray concept in
      array.

      A substring can be:

     Continous part of string.
     Full string can be a substring.
     A single character can also be a subsring.


     Example
     Suppose, we have a string as
     "abc"

     There are total 6 substring can be formed from the above string. All substrings are
     "a"
     "b"
     "c"
     "ab"
     "bc"
     "abc"

     Total number of substring of a given string = n(n+1)/2

     asdf
     n = 4, 4*5/2 = 10
     a
     s
     d
     f
     as
     sd
     df
     asd
     sdf
     asdf

     Example 3:
     How many total substrings will be there for the String "bxcd" ?

     n*(n + 1)/2
     All the substrings are as follows-"b", "x", "c", "d", "bx",
     "xc", "cd", "bxc", "xcd", "bxcd"

     We can also find the count using n*(n+1)/2.

      */

      /*
       Question 2 Check Palindrome
       Check whether the given substring of string s is palindrome or not.
       A palindrome is the sequence of characters that reads the same forward and backward.for example, "nayan", "madam", etc.

       TestCase

       Input

       s = "anamadamspe"
       start = 3
       end = 7
       Output
       true

       Explanation
       The substring formed from index 3 to 7 is "madam" which is palindrome.

      Approach:
      Below is the simple algorithm to check whether the substring is palindrome or not:
      Initialize two indices start and end to point to the beginning and end of the string, respectively.
      While start is less than end, do the following:
      If the character at index start is not equal to the character at index end, the string is not a palindrome. Return false.
      Else, increment start and decrement end.
      If the loop completes without finding a non-matching pair,
      the string is a palindrome. Return true.


      */

      /*
       Question 3 : Longest Palindromic substring
       Given a string s, calculate the length of longest palindromic substring in s.

      TestCase
      Input
      "anamadamm"
      Output : 5

      Explanation
      The substring "madam" of size 5 is the
      longest palindromic substring that can be formed
      from given string.


      What is the length of longest palindromic substring
      within string "feacabacabgf" ? - acabaca
      Ans - 7

      Question
      What is the length of longest palindromic substring
      within string "a d a e b c d f d c b e t g g t e" ?

      Ans 9

      */


      /*
      Question 4 Brute Force Approach
      The naive approach is to for all the substring
      check whether the string is palindrome or not.
      if it is palindrome and its size is greater than the
      previous answer(which is initially 0), then update the answer.
      */

      /*
       In languages like Java, C#,
       JavaScript, Python and Go, strings are immutable,
       which means it's value can't be changed.
      */



    }
}

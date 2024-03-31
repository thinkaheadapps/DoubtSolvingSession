package Refresher.Strings1;

public class Toggle {
    public static void toggle(char[] s) {
        int n = s.length;
        for (int i = 0; i < n; i++) {
            if (s[i] >= 65 && s[i] <= 91) {
                System.out.print((char)(s[i] + 32));
            } else {
                System.out.print((char)(s[i] - 32));
            }
        }
    }

    public static void main(String[] args) {
        char[] str = "HelloWorld".toCharArray();
        toggle(str);
    }
}

/*
Complexity
Time Complexity- O(N).
Space Complexity- O(1).
*/

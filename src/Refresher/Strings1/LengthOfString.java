package Refresher.Strings1;

import java.util.*;

public class LengthOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < T; i++) {
            String s = sc.nextLine();
            System.out.println(s.length());
        }
    }

}

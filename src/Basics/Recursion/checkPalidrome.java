package Basics.Recursion;

import java.util.Scanner;

public class checkPalidrome {
    static boolean checkPalidrome(int start, int end, String str)
    {
        if (start >= end)
        {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)){
            return false;
        }

        return checkPalidrome(start+1, end-1, str);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start=0;
        int end = str.length()-1;
        boolean ans = checkPalidrome(start,end, str);
        System.out.println(ans);
    }
}

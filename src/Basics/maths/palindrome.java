package Basics.maths;

import java.util.Scanner;

public class palindrome {

    public static boolean checkPalindrome(int num)
    {
        int original = num;
        int reverse = 0;
        while (num!=0)
        {
            reverse = reverse*10 + num%10;
            num = num/10;
        }

        if (reverse == original)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = checkPalindrome(n);
        System.out.println(ans);
    }
}

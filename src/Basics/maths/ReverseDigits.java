package Basics.maths;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseDigits {
    public static int reverseDigitsNum(int num) {
        int revNum = 0;
        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num); // vvi line

        while (num != 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = reverseDigitsNum(num);
        System.out.println(ans);
    }
}

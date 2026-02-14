package Basics.Recursion;

import java.util.Scanner;

public class SumNaturalNum {

    static int printSumOfNaturalNumber(int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }

        return n+ printSumOfNaturalNumber(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = printSumOfNaturalNumber(n);
        System.out.println(ans);
    }
}

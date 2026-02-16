package Basics.Recursion;

import java.util.Scanner;

public class Fibonacci {
    // 0 1 1 2 3 5
    static void printFibonacci(int n)
    {
        int first = -1;
        int second = 1;
        int third = first + second;
        for (int i=0;i<=n;i++)
        {
            System.out.print(third + " ");
            first = second;
            second = third;
            third = first + second;
        }
    }

    static int printFib(int n)
    {
        if(n== 0 || n==1)
        {
            return n;
        }
        return printFib(n-1) + printFib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         //printFibonacci(n);
         int sum = printFib(n);
         System.out.println(sum);
    }
}

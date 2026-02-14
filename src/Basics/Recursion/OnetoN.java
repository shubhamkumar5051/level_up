package Basics.Recursion;

import java.util.Scanner;

public class OnetoN {

    static void printN(int start,int n)
    {
        if(start > n)
        {
            return;
        }
        System.out.println(start);
        printN(start+1,n);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(1,n);

    }
}

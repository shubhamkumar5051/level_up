package Basics.Recursion;

import java.util.Scanner;

public class NtoOne {


    static void printNto1(int index, int n){
        if (n < index)
        {
            return;
        }
        System.out.println(n);
        printNto1(index, n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(1,n);
    }
}

package Basics.Recursion;

import java.util.Scanner;

public class factorial {

    static int findFactorial(int n)
    {
        if(n ==1 || n==0 ){
            return 1;
        }
        return n * findFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findFactorial(n);
        System.out.println(ans);
    }
}

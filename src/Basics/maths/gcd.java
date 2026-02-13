package Basics.maths;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans =0;
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int start = Math.min(num1, num2);
        for(int i = start; i>=1 ;i--){
            if(num1%i ==0 && num2%i==0)
            {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}

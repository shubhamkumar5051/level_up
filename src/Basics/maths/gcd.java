package Basics.maths;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class gcd {
    static int findGcd(int num1, int num2){
        int ans = 1;
        int start = Math.min(num1, num2);
        for(int i = start; i>=1 ;i--){
            if(num1%i ==0 && num2%i==0)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }

    static int findGcd1(int num1, int num2)
    {
        int ans =0;
        while(num1 !=0 && num2!=0)
        {
            if(num1 > num2)
            {
                num1 = num1%num2;
            }else{
                num2 = num2%num1;
            }
        }

        if(num1 ==0)
        {
            ans = num2;
        }else{
            ans = num1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int ans = findGcd1(num1, num2);
        System.out.println(ans);
    }
}

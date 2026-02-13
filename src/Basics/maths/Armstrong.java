package Basics.maths;

import java.util.Scanner;

public class Armstrong {

    static boolean checkArmstrong(int n, int n1)
    {
        if(n1==n){
        return true;}else{
            return false;
        }
    }
    static int countNum(int n)
    {
        int count =0;
        while (n!=0)
        {
            count++;
            n= n/10;
        }
        return count;
    }
    static int Operation(int num, int count){
        int finalAns=0;
        int cube =1;
        while (num!=0)
        {
            int temp = num%10;
            for(int i=1;i<=count;i++)
            {
                cube = cube*temp;
            }
            finalAns = finalAns + cube;
            cube=1;
            num = num/10;
        }
        return finalAns;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("false");
        }
        int counter = countNum(n);
        int output = Operation(n, counter);
        boolean ans = checkArmstrong(n,output);
        System.out.println(ans);
    }
}

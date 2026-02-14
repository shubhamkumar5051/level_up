package Basics.maths;

import java.util.Scanner;

public class PrimeNumber {

//    static boolean check_prime(int num){
//        for (int i=2; i<num ;i++)
//        {
//            if(num%i == 0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }

    static boolean check_prime(int num){
        int cnt=0;
        for (int i=1; i*i<= num ;i++)
        {
            if(num%i == 0)
            {
                cnt++;
                if((num/i) !=i)
                {
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = check_prime(num);
        System.out.println(ans);
    }
}

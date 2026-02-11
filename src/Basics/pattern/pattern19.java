package Basics.pattern;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                int n = sc.nextInt();
                /*
                [3,1,3]
                [2,3,2]
                [1,5,1]
                [0,7,0]
                */
        char count = 'A';
        for(int i=0;i<n;i++)
        {
            count = 'A';
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }

            // stars

            for(int j=0; j<2*i+1;j++)
            {
                System.out.print(count);
                if(j<i){
                    count++;
                }else{
                    count--;
                }
            }
            System.out.println();
        }
    }
}

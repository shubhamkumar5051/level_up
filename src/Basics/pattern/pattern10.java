package Basics.pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //above pyramid
        /*[4,1,4]
          [3,3,3]
          [2,5,2]
          [1,7,1]
          [0,9,0]
         */
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0; j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*n-2*i-1; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
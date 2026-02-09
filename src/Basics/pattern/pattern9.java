package Basics.pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerLoop = sc.nextInt();
        /*[0,9,0]
          [1,7,1]
          [2,5,2]
          [3,3,3]
          [4,1,4]
        */

        for(int i=0;i<outerLoop;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for (int j=0;j<outerLoop*2-2*i-1 ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

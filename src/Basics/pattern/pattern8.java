package Basics.pattern;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outer = sc.nextInt();

        for (int i=0;i<outer;i++){
            for (int j=0; j<outer-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package Basics.pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int outerLoop = sc.nextInt();
        for (int i=0;i<outerLoop;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}

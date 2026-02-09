package Basics.pattern;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outerLoop = scanner.nextInt();
        //int innerLoop = scanner.nextInt();
        for(int i=0; i < outerLoop; i++)
        {
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

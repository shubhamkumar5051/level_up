package Basics.pattern;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}

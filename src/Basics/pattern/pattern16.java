package Basics.pattern;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char count='A';
        for (int i=0;i<n;i++){
            count = 'A';
            for (int j=0;j<n-i;j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}

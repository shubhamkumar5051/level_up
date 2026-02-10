package Basics.pattern;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char count='A';
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++)
            {
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }
}

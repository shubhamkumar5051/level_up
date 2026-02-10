package Basics.pattern;

import java.util.Scanner;

public class pattern18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char letter = 'A';
        for (int i=0;i<n;i++){
            letter = (char) ('A' + n- i-13);
            for (int j=0;j<i+1;j++)
            {
                System.out.print(letter++);
            }
            System.out.println();
        }
    }
}

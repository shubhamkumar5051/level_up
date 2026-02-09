package Basics.pattern;

import java.util.Scanner;

public class pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerLoop = sc.nextInt();

        for (int i = outerLoop ; i>0; i--){
            for (int j =0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}

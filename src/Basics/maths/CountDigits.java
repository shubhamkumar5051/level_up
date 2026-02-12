package Basics.maths;

import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int num) {
        int counter = 0;
        while (num != 0) {
            counter++;
            num = num / 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = countDigits(num);
        System.out.println(result);
    }
}
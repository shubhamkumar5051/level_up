package Basics.Hashing;

import java.util.Scanner;

public class BasicHash {

    public static int findLargest(int size, int[] arr){
        int largest = arr[0];

        for (int i=1;i<arr.length;i++)
        {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void printHashing(int arrSize, int[] arr, int query){
//      int num = findLargest(arrSize, arr)+1;
        int num = 13;

        System.out.println("creating hasharray of size : "+ num);

        int [] hashArray = new int[num];

        for (int i=0;i< hashArray.length;i++)
        {
            hashArray[i] = 0;
        }

        for (int i=0; i<arr.length;i++)
        {
            hashArray[arr[i]]++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter array elements");
        for (int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of query");
        int query = sc.nextInt();
        printHashing(size, arr, query);

    }

}

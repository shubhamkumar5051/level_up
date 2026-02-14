package Basics.Recursion;

public class ReverseArray {

    static void reverseArr(int start, int end, int[] arr)
    {
        if(start >= end)
        {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(start+1, end-1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start =0;
        int end= arr.length-1;
        reverseArr(start,end,arr);

        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}

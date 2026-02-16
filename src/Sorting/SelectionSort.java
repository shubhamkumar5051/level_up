package Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3, 4, 12, 1, 15, 6};
        int min;
        for(int i=0;i<arr.length;i++)
        {
            int temp =i;
            min = Integer.MAX_VALUE;
           for (int j= i; j<arr.length;j++)
           {
               if(arr[j] < min)
               {
                   min = arr[j];
                   temp = j;
               }
           }
           int value = arr[i];
           arr[i] = arr[temp];
           arr[temp] = value;
        }

        for (int x : arr)
        {
            System.out.println(x);
        }
    }
}

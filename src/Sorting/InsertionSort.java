package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 12, 1, 15, 6};

        for (int i=0;i<arr.length;i++)
        {
          int j = i;
          while (j > 0 && arr[j-1] > arr[j]){
              //swap
              int temp = arr[j-1];
              arr[j-1] = arr[j];
              arr[j] = temp;
              j--;
          }
        }
        for (int x : arr)
        {
            System.out.println(x);
        }

    }
}

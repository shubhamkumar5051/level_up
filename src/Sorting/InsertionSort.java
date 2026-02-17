package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 12, 1, 15, 6};

        int k =0;
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1; j<arr.length;j++)
            {
                k = j;
                int temp = arr[k];
                while (k > 0 && arr[k - 1] > temp) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                arr[k]= temp;
            }
        }
        System.out.println("yess");
        for (int x : arr)
        {
            System.out.println(x);
        }

    }
}

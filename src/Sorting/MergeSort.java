package Sorting;

public class MergeSort {
    static void merger(int[] arr, int left,int mid, int right){
        int [] temp = new int[right-left+1];
        int i  = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while(j<=right){
            temp[k] = arr[j];
            k++;
            j++;
        }
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low>=high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merger(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int [] arr = {2,17,3,90,1,4};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr, low, high);
    }
}

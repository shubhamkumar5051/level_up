package Practice;

public class Main {
    public static void main(String[] args) {
        int [] arr= {3,2,16,7,19,1};

        //insertion sort:- pick the element from unsorted array and place them at right place in sorted array

        for(int i=0;i<arr.length;i++){
            int j=i;
            while( j>0 && arr[j-1]>arr[j]){
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
package Practice;

public class Main {
    public static void main(String[] args) {

        int [] arr= {3,2,6,7,19,1};
        int swapindex = 0;
        for (int i=0;i<arr.length;i++)
        {
            int mini = arr[i];
            swapindex = i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j] <= mini)
                {
                    mini = arr[j];
                    swapindex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[swapindex];
            arr[swapindex] = temp;
        }

        for (int x :arr)
        {
            System.out.println(x);
        }
    }
}
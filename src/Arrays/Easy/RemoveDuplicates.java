package Arrays.Easy;

import java.util.ArrayList;

public class RemoveDuplicates {
    static int removeDuplicate(int [] arr)
    {
        int temp = 1;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                arr[temp] = arr[i+1];
                temp++;
            }
        }
        return temp-1;
    }
    public static void main(String [] args)
    {
        int [] arr1 = {1,1,1,2,2,3,3,3};
         int ans =removeDuplicate(arr1);
    }
}

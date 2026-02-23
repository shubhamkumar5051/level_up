package Arrays.Easy;

public class secondLargest {
    static int findSecondLargest(int [] arr)
    {
        if(arr.length < 2){
            System.out.println("array must be of 2 size");
        }
        int maxi = Integer.MIN_VALUE;
        int second_maxi = maxi;
        for(int x : arr)
        {
            if(x > maxi){
                second_maxi = maxi;
                maxi = x;
            }else{
                if(x > second_maxi && x != maxi){
                    second_maxi = x;
                }
            }
        }
        if(second_maxi == Integer.MIN_VALUE)
        {
            System.out.println("no 2nd largest number found");
        }
        return second_maxi;
    }

    public static void main(String[] args)
    {
        int[] arr = {10,10,5};
        int ans = findSecondLargest(arr);
        System.out.println(ans);
    }
}

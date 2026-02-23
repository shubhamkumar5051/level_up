package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr = {8,67,56,88,2,5,0,1};
        int mini = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < mini)
            {
                mini = i;
            }
        }
        System.out.println(mini);
    }
}

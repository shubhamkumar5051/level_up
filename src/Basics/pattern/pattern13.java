package Basics.pattern;

public class pattern13 {
    public static void main(String[] args) {
        int n = 6; int count=1;
        int counter =1;
        for (int i=0;i<n;i++)
        {
               /*
            [1,10,1]
            [2,8,2]
            [3,6,3]
            [4,4,4]
            [5,2,5]
            [6,0,6]
            */
            counter =i+1;
            for(int j=0;j<i+1;j++)
            {
                System.out.print(j+1);
            }
            for (int j=0;j<2*n-2*i-2;j++)
            {
                System.out.print(" ");
            }

            for (int j=0;j<i+1;j++)
            {
                System.out.print(counter--);
            }
            System.out.println();
        }
    }
}

package Basics.maths;

import java.util.*;

public class AllDivisor {

    static List<Integer> getAllDivisor (int num){
        List<Integer> ans = new ArrayList<>();
        for(int i=1; i*i<=num ;i++){
            if (num%i==0)
            {
                ans.add(i);
                if(i != num/i){
                    ans.add(num/i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ans = getAllDivisor(n);
        Collections.sort(ans);
        System.out.println(ans);

    }
}

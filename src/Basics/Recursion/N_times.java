package Basics.Recursion;

public class N_times {

    static void print_name(int n){
        if(n==0 )
        {
            return;
        }
        System.out.println("shubham");
        n--;
        print_name(n);
    }
    public static void main(String[] args) {
        int n = 3;
        print_name(n);
    }
}

package Recursion;

public class Fib {

    public static void main(String[] args) {
        int n = 8;
        int f = 0;
        int s = 1;
        System.out.print(+f + " " +s + " ");
        for(int i =1; i<=n-2; i++){
            int t = f + s;
            System.out.print(+t + " ");
            f = s;
            s = t;
        }


    }
}
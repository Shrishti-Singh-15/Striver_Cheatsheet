package Recursion;

import java.util.Scanner;

public class Fibonacci_Series {
    public static int func(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return func(n-1) + func(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(func(i) + " ");
        }
    }
}

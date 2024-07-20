package Recursion;

import java.util.Scanner;

public class Sum_of_First_N_numbers {
    public static long func(long n){
        if(n == 0) {
            return 0;
        }
        return (long) Math.pow(n, 3) + func(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long op = func(n);
        System.out.println("The Result is: " + op);
    }
}

package Recursion;

import java.util.Scanner;

public class Print_N_to_1 {
    public static void func(int n){
        if(n == 0){
            return;
        }
        System.out.println(n + " ");
        func(n-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}

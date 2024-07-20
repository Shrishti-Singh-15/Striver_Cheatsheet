package Recursion;

import java.util.Scanner;

public class Print_1_to_N_without_loop {
    public static void print_1_to_N(int n){
        if(n == 0){
            return;
        }
        print_1_to_N(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        print_1_to_N(n);
    }
}

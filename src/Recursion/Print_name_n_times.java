package Recursion;

import java.util.Scanner;

public class Print_name_n_times {
    public static void print_Name_Ntime(int n, String str){
        if(n == 0){
            return;
        }
        System.out.println(str);
        print_Name_Ntime(n-1, str);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the name: ");
        String str = sc.next();
        print_Name_Ntime(n, str);
    }
}

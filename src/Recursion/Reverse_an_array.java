package Recursion;

import java.util.Collections;
import java.util.Scanner;

public class Reverse_an_array {
    public static void func(int i, int arr[], int n){
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        func(i+1, arr, n);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        func(0, arr, n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}

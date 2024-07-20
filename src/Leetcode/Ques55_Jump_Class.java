package Leetcode;

import java.util.Scanner;

public class Ques55_Jump_Class {
    public static boolean canJump(int[] arr){
        int step = 0;
        for(int i = 0; i< arr.length; i++){
            if(i>step){
                return false;
            }
            step = Math.max(step, i+arr[i]);
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = canJump(arr);
        System.out.println(result);
    }
}

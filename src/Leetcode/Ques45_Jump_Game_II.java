package Leetcode;

import java.util.Scanner;

public class Ques45_Jump_Game_II {
    public static int jump(int[] arr, int n){
        if(n <= 1){
            return 0;
        }
        int current = 0;
        int step = 0;
        int jump = 0;
        for(int i=0; i<n; i++){
            if(i > step){
                return 0;
            }
            step = Math.max(step, i+arr[i]);

            if(i == current){
                jump++;
                current = step;
            }

            if(current >= n-1){
                break;
            }
        }
        return jump;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an array: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int result = jump(arr, n);
        System.out.println("The result is: " + result);
    }
}

package Array;

import java.util.Scanner;

public class Check_If_Array_Is_Sorted {
    public static boolean check(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        if(arr[arr.length-1] > arr[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = check(arr);
        System.out.println(result);
    }
}

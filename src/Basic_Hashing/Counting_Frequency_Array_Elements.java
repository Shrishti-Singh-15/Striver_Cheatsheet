package Basic_Hashing;

import java.util.Scanner;

public class Counting_Frequency_Array_Elements {
    public static void frequency_count(int arr[], int N, int P){
        int countArr[] = new int[P];
        for(int i=0; i<N; i++){
            countArr[arr[i] - 1] = countArr[arr[i] - 1] + 1;
        }
        for(int i=0; i<N; i++){
            if(i < P){
                arr[i] = countArr[i];
            }
            else{
                arr[i] = 0;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int P = sc.nextInt();
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        frequency_count(arr, N, P);
        for(int i=0;i<N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

package Basic_Maths;

import java.util.Scanner;

public class Count_Digits {
    static int evenlyDivides(int N){
        int count = 0;
         int dupnumber = N;
         while(N>0){
             int rem = N%10;
             N = N/10;
             if(rem != 0){
                 if(dupnumber % rem == 0){
                     count++;
                 }
             }
         }
         return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = evenlyDivides(a);
        System.out.println("Result:" + result);
    }
}

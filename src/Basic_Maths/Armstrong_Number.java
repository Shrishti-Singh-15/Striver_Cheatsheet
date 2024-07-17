package Basic_Maths;

import java.util.Scanner;

public class Armstrong_Number {
    public static String armstrong(int n){
        int sum = 0;
        int N = n;
        int rem, val;
        while(n>0){
            rem = n%10;
            val = rem*rem*rem;
            sum = sum + val;
            n = n/10;
        }
        if(sum == N){
            return "true";
        }
        else{
            return "false";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String op = armstrong(n);
        System.out.println("Result is: " + op);
    }
}

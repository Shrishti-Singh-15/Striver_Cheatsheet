package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial_Numbers_Less_Than_Equal_to_N {
    public static ArrayList<Long> factorialNumbers(long n){
        ArrayList<Long> list = new ArrayList<>();

        long fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
            if(fact <= n){
                list.add(fact);
            }else break;
        }
        return list;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        ArrayList<Long> result = Factorial_Numbers_Less_Than_Equal_to_N.factorialNumbers(n);
        for(long num : result){
            System.out.print(num + " ");
        }
    }
}

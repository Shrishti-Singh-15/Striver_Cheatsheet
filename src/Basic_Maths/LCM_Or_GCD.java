package Basic_Maths;

import java.util.Scanner;

public class LCM_Or_GCD {
    public static long gcd(long a, long b){
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b= b%a;
            }
        }
        if(a==0){
            return b;
        }
        else
            return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();

        long GCD = gcd(a,b);
        long LCM = (a*b)/GCD;
        System.out.println("LCM of "+ a + " and " + b + " is " + LCM + ". GCD is " + GCD + ".");
    }
}

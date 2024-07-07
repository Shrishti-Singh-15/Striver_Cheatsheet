//Leetcode
package Basic_Maths;

import java.util.Scanner;

public class Reverse_Integer {
    public static int reverse(int x){
        int sign = x < 0 ? -1 : 1;
        int rev = 0;
        while( x > 0){
            int rem = x % 10;
            if(rev > (Integer.MAX_VALUE-rem) / 10){
                return 0;
            }
            rev = rev * 10 + rem;
            x = x/10;
        }
        return sign * rev;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the variable: ");
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println("Result: " + result);
    }
}

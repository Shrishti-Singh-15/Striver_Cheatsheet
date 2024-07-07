package Basic_Maths;

import java.util.Scanner;

public class Pallindrome_Number {
    public static boolean pallindrome(int x){
        int rev = 0;
        int dummy = x;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                int rem = x%10;
                rev = rev*10 + rem;
                x = x/10;
            }
            if (rev == dummy){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String aargs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        boolean result = pallindrome(x);
        System.out.println("Result: " + result);
    }
}

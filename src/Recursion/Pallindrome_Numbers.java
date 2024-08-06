//Leetcode 125
package Recursion;

import java.util.Scanner;

public class Pallindrome_Numbers {
    public static boolean isPallindrome(String str){
        if(str == null){
            return false;
        }
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left ++;
            }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        boolean result = isPallindrome(str);
        System.out.println(result);
    }
}

package Basic_Maths;

import java.util.Scanner;
import java.lang.Math;

public class Sum_of_All_Divisors {
    public static int sumofdivisors(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = (int) (sum + (i*(Math.floor(n/i))));
        }
        return sum;
    }
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n = sc.nextInt();
        int output = sumofdivisors(n);
        System.out.println("The result is: " + output);
    }
}

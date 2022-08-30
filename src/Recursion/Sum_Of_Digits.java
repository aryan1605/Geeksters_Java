package Recursion;
import java.util.Scanner;

public class Sum_Of_Digits {
    // d = no. of digits in number 'n'.
    public static int SumOfDigits(int n) // Recursive Solution
    {
        if(n <= 9)
        {
            return n;
        }
        return SumOfDigits(n / 10) + (n % 10);
        // Time Complexity = O(d)
        // Auxiliary Space = O(d)
    }
    public static int SumOfDigits1(int n) // Iterative Solution (Preferred)
    {
        int res = 0;
        while(n > 0)
        {
            res = res + (n % 10);
            n = n / 10;
        }
        return res;
        // Time Complexity = O(d)
        // Auxiliary Space = O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n+" = "+SumOfDigits(n));
        System.out.println("Sum of digits of "+n+" = "+SumOfDigits1(n));
    }
}

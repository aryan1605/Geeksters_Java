package Recursion;
import java.util.Scanner;

public class Sum_Natural_Numbers {
    public static int getSum(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return n + getSum(n-1);
        //Time Complexity = Theta(n)
        //Recurrence Relation => T(n) = T(n-1) + Theta(1)
        //Auxiliary Space = Theta(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers = "+getSum(n));
    }
}

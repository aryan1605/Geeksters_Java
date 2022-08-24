package Recursion;
import java.util.Scanner;

public class Print_1toN {
    public static void Print1toN(int n)
    {
        if(n == 0)
        {
            return;
        }
        Print1toN(n-1);
        System.out.print(n+" ");
        // Time Complexity = O(n)
        // Auxiliary Space = O(n)
        // Recurrence Relation => T(n) = T(n-1) + Theta(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Print1toN(n);
    }
}

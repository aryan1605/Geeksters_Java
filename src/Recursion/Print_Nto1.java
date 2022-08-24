package Recursion;
import java.util.Scanner;

public class Print_Nto1 {
    public static void PrintNto1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n+" ");
        PrintNto1(n-1);
        // Time Complexity = O(n)
        // Auxiliary Space = O(n)
        // Recurrence Relation => T(n) = T(n-1) + Theta(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        PrintNto1(n);
    }
}

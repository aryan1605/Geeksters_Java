package Bit_Manipulation;
import java.util.Scanner;

public class Count_Total_SetBits {
    private static int PerfectSquare(int n)
    {
        int c = 0;
        while((1 << c) <= n)
        {
            c++;
        }
        return c-1;
    }
    public static int countSetBits(int n){

        // Your code here
        if(n == 0)
        {
            return 0;
        }
        int max = PerfectSquare(n);
        return ((1 << (max-1)) * max) + (n - (1 << max)) + 1 + countSetBits(n - (1 << max));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Number of Set Bits from 1 to "+n+" : "+countSetBits(n));
        // Time Complexity = O(log(n))
    }
}

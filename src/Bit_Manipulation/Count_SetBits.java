package Bit_Manipulation;
import java.util.Scanner;

public class Count_SetBits {
    static int [] table = new int[256];


    public static void initialize()
    {
        table[0] = 0;
        for(int i = 1;i<256;i++)
        table[i] = (i & 1) + table[i/2];
    }
    public static int Count_Set1(int n) // Brian and Kerningham Algorithm.
    {
        int res = 0;
        while(n > 0)
        {
            n = (n & (n-1));
            res++;
        }
        return res;
        // Time Complexity : Theta(Set Bit Count)
    }
    public static int Count_Set2(int n) // Lookup Table Method for 32-bit numbers.
    {
        int res = 0;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        return res;
        // Time Complexity : Theta(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        initialize();
        System.out.println("Number of Sets in the number : "+Count_Set1(n));
        System.out.println("Number of Sets in the number : "+Count_Set2(n));
    }
}

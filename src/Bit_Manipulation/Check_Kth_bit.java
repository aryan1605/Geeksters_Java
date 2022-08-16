package Bit_Manipulation;
import java.util.Scanner;

public class Check_Kth_bit {
    public static void CheckKthbit1(int n,int k) // Using Left Shift Operator
    {
        if((n & (1 << (k-1))) != 0)
            System.out.println("SET");
        else
            System.out.println("NO SET");
    }
    public static void CheckKthbit2(int n,int k) // Using Right Shift Operator
    {
        if((1 & (n >> (k-1))) == 1)
            System.out.println("SET");
        else
            System.out.println("NO SET");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and k : ");
        int n = sc.nextInt(),k = sc.nextInt();
        CheckKthbit1(n,k);
        CheckKthbit2(n,k);
    }
}

package Bit_Manipulation;
import java.util.Scanner;

public class Power_Of_Two {

    public static boolean PowerOfTwo(int n)
    {
       if(n == 0)
           return false;

       return ((n & (n-1)) == 0);
       // Time Complexity = Theta(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(PowerOfTwo(n))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

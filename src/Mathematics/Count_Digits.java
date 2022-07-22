package Mathematics;
import java.util.Scanner;

public class Count_Digits {
    public static int Count1(long n) // Iterative Method
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count++;
        }
        return count;
        // Time Complexity = Theta(d) where d is the number of digits in number 'n'.
    }
    public static int Count2(long n) // Recursive Method
    {
     if(n == 0)
     {
         return 0;
     }
     return 1 + Count2(n/10);
    }
    public static int Count3(long n) // Logarithmic Method
    {
       return (int)Math.floor(Math.log10(n) + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        long n = sc.nextLong();
        System.out.println("Number of digits in number "+n+" : ");
        System.out.println(Count1(n));
        System.out.println(Count2(n));
        System.out.println(Count3(n));
    }
}

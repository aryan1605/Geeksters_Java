package Mathematics;
import java.util.Scanner;

public class Factorial {
    public static long fact1(long n) // Iterative Method
    {
        long f = 1;
        for(long i = 2;i <= n;i++)
        {
            f = f * i;
        }
        return f;
        //Time Complexity = Theta(n)
        //Auxiliary Space = Theta(1)
    }
    public static long fact2(long n) // Recursive Method
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n * fact2(n-1);
        //Time Complexity = Theta(n)
        //Auxiliary Space = Theta(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        long n = sc.nextLong();
        System.out.println(fact1(n));
        System.out.println(fact2(n));
    }
}

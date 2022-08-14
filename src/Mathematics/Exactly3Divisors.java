package Mathematics;
import java.util.Scanner;

public class Exactly3Divisors {
    public static boolean Check_Prime(int n)
    {
        if(n <= 1)
            return false;

        if(n % 2 == 0 || n % 3 == 0)
            return false;

        for(int i = 5;i * i <= n;i+=6)
        {
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    public static int exactly3Divisors(int N)
    {
        if(N <= 3)
            return 0;

        if(N < 9)
            return 1;

        if(N == 9)
            return 2;

        int count = 2;
        for(int i = 5;i * i <= N;i++)
        {
            if(Check_Prime(i))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Count of Numbers Having Exactly Three Divisors : "+exactly3Divisors(n));
//        Expected Time Complexity : O(N1/2 * N1/4)
//        Expected Auxilliary Space :  O(1)
    }
}

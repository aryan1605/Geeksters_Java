package Mathematics;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void sieve(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i = 2;i <= n;i++)
        {
            if(isPrime[i])
            {
                System.out.print(i+" ");
                for(int j = i * i;j <= n;j = j + i)
                isPrime[j] = false;
            }
        }
    }
    // Time Complexity = O(n * log(log(n)))
    // Auxiliary Space = O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sieve(n);
    }
}

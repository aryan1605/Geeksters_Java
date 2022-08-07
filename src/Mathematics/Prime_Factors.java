package Mathematics;
import java.util.Scanner;

public class Prime_Factors {
    public static void primeFactors(int n)
    {
        if(n <= 1)
        {
            return;
        }
        while(n % 2 == 0)
        {
            System.out.print(2+" ");
            n = n / 2;
        }
        while(n % 3 == 0)
        {
            System.out.print(3+" ");
            n = n / 3;
        }
        for(int i = 5;i * i <= n;i+=6)
        {
            while(n % i == 0)
            {
                System.out.print(i+" ");
                n = n / i;
            }
            while(n % (i+2) == 0)
            {
                System.out.print((i+2)+" ");
                n = n / (i+2);
            }
        }
        if(n > 3)
            System.out.print(n);
        // Worst Case = When 'n' is prime, Theta(sqrt(n))
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        primeFactors(n);
    }
}

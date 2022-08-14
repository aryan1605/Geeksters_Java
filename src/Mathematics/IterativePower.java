package Mathematics;
import java.util.Scanner;

public class IterativePower {
    public static int power(int x,int n)
    {
        int res = 1;
        while(n > 0)
        {
            if(n % 2 != 0)
            res = res * x;

            x = x * x;
            n = n / 2;
        }
        return res;
        // Time Complexity = O(log(n))
        // Auxiliary Space = O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and the power : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}

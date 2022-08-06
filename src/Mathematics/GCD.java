package Mathematics;
import java.util.Scanner;

public class GCD {
    public static int gcd(int A,int B)
    {  //        Assumption : A % B
        if(B == 0)
        {
            return A;
        }
        return gcd(B,A % B);
        // Time Complexity = O(log(min(a,b)))
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("GCD of two numbers = "+gcd(A,B));
    }
}

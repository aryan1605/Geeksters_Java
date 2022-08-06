package Mathematics;
import java.util.Scanner;

public class LCM {
    public static int gcd(int a,int b)
    {
        // Assumption = a % b;
        if(b == 0)
        {
            return a;
        }
        return gcd(b,a % b);
        // Time Complexity = O(log(min(a,b)))
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of the two numbers = "+(a * b)/gcd(a,b));
    }
}

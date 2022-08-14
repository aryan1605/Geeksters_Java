package Mathematics;
import java.util.Scanner;

public class ComputingPower {
    public static int power(int x,int n)
    {
        if(n == 0)
        return 1;

        int temp = power(x,n/2);
        temp = temp * temp;
        if(n % 2 == 1)
        {
            temp = temp * x;
        }
        return temp;
        // Time Complexity = Theta(log(n))
        // Auxiliary Space = Theta(log(n))
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and the power : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}

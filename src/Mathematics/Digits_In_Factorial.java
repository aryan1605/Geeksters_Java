package Mathematics;
import java.util.Scanner;

public class Digits_In_Factorial {
    public static int digitsInFactorial(int N){
        // code here
        if(N == 0 || N == 1)
            return 1;

        double sum = 0;
        for(int i = 2;i<=N;i++)
        {
            sum += Math.log10(i);
        }
        return (int)Math.floor(sum) + 1;
        // Formula Used = log(a * b * c .... * n) = log(a) + log(b) + log(c) + .... + log(n)
        // Time Complexity = O(N)
        // Auxiliary Space = Theta(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Number of digits in factorial of "+n+" is "+digitsInFactorial(n));
    }
}

package Mathematics;

import java.util.Scanner;

public class Trailing_Zeros {
    public static int Count_Zeros(int n)
    {
       int count = 0;
       for(int i = 5;i<=n;i*=5)
       count += n/i;
       return count;

//       Time Complexity = Theta(log n)
//        Space Complexity = Theta(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Number of Trailing Zeros in the factorial of "+n+" : "+Count_Zeros(n));
    }
}

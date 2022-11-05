package Searching;
import java.util.Scanner;

public class Square_Root {
    public static int sqrt(int n)
    {
        if(n == 0 || n == 1)
            return n;
        int low = 1,end = n,ans = -1;
        while(low <= end)
        {
            int mid = low + (end-low)/2;
            int sq = mid * mid;
            if(sq == n)
                return mid;
            else if(sq > n)
                end = mid-1;
            else
            {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
        // Time Complexity = O(log n)
        // Auxiliary Space = O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Square root = "+sqrt(n));
    }
}

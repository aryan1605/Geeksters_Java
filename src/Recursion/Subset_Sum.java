package Recursion;
import java.util.Scanner;

public class Subset_Sum {
    public static int SubsetSum(int [] arr,int n,int sum)
    {
        // This Question is based on Recursion Tree Approach.
       if(n == 0)
       {
          return (sum == 0)?1:0;
       }
       return SubsetSum(arr,n-1,sum) + SubsetSum(arr,n-1,sum-arr[n-1]);
       //Time Complexity = Theta(2^n)
        //We can further optimize this solution using DP whose Time Complexity = Theta(n * target sum).
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum : ");
        int sum = sc.nextInt();
        System.out.println("Number of subsets that results the target sum = "+SubsetSum(arr,n,sum));
    }
}

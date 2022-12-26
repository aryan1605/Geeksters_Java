package Arrays;
import java.util.Scanner;

public class Circular_Subarray {
    public static int NormalSubarraySum(int [] arr)  // Kadane's Algorithm
    {
        int n = arr.length;
        int maxEnding = arr[0],res = arr[0];
        for(int i = 1;i<n;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
        //Time Complexity : O(n)
        //Auxiliary Space : O(1)
    }
    public static int CircularSubarraySum(int [] arr)
    {
        int n = arr.length;
        // Maximum Normal Subarray Sum
        int max_normal = NormalSubarraySum(arr);
        // When all the elements are negative.
        if(max_normal < 0)
            return max_normal;
        // Maximum Circular Subarray Sum
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum + arr[i];
            arr[i] = arr[i] * -1;
        }
        int max_circular = sum + NormalSubarraySum(arr);
        return Math.max(max_normal,max_circular);
        //Time Complexity : O(n)
        //Auxiliary Space : O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Circular Subarray Sum = "+CircularSubarraySum(arr));
    }
}

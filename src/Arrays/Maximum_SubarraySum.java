package Arrays;
import java.util.Scanner;

public class Maximum_SubarraySum {
    public static int maxSubarray(int [] arr)
    {
        int n = arr.length;
        int maxEnding = arr[0],res = arr[0];
        for(int i = 1;i<n;i++)
        {
            maxEnding = Math.max(arr[i] + maxEnding,arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
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
        System.out.println("Maximum Subarray Sum = "+maxSubarray(arr));
    }
}

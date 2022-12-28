package Arrays;
import java.util.Scanner;
// Find the maximum sum of K consecutive elements.
public class Sliding_Window {
    public static int maxKSum(int [] arr,int k)
    {
        int n = arr.length;
        int curr = 0;
        for(int i = 0;i<k;i++)
            curr += arr[i];
        int res = curr;
        for(int i = k;i<n;i++)
        {
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(res,curr);
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
        int k = sc.nextInt();
        System.out.println("Maximum K Subarray Sum = "+maxKSum(arr,k));
    }
}

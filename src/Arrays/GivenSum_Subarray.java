package Arrays;
import java.util.Scanner;

public class GivenSum_Subarray {
    public static boolean givenSumSubarray(int [] arr,int sum)
    {
        int n = arr.length;
        int s = 0,curr = 0;
        for(int e = 0;e < n;e++)
        {
            curr = curr + arr[e];
            if(sum < curr)
            {
                curr -= arr[s];
                s++;
            }
            if(curr == sum)
                return true;
        }
        return false;
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
        int sum = sc.nextInt();
        if(givenSumSubarray(arr,sum))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

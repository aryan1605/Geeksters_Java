package SlidingWindow;
import java.util.Scanner;

public class MaximumSumSubarray_SizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("Maximum Sum Subarray of size "+k+" = "+MaximumSumSubarray(arr,k));
    }
    public static int MaximumSumSubarray(int [] arr,int k)
    {
        int n = arr.length;
        int i = 0,j = 0;
        int sum = 0,max = Integer.MIN_VALUE;
        while(j < n)
        {
            sum = sum + arr[j];
            if((j - i + 1) < k) // Increasing the value of 'j' until the size of the window becomes equal to 'k'.
                j++;
            else if((j - i + 1) == k)
            {
                max = Math.max(max,sum);

                //Operations performed to move the window forward provided the size of the window remains constant.
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}

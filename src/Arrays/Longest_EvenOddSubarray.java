package Arrays;
import java.util.Scanner;

public class Longest_EvenOddSubarray {
    public static int maxEvenOddSubarray(int [] arr)
    {
        int n = arr.length;
        int max = 1,curr = 1;
        for(int i = 1;i<n;i++)
        {
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i-1] % 2 == 0 && arr[i] % 2 != 0))
            {
                curr++;
                max = Math.max(max,curr);
            }
            else
                curr = 1;
        }
        return max;
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
        System.out.println("Maximum EvenOdd Subarray Length = "+maxEvenOddSubarray(arr));
    }
}

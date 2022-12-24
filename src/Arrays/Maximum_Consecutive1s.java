package Arrays;
import java.util.Scanner;

public class Maximum_Consecutive1s {
    public static int max1s(int [] arr)
    {
        int n = arr.length;
        int curr = 0,max = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == 0)
            {
                max = Math.max(max,curr);
                curr = 0;
            }
            else
                curr++;
        }
        return Math.max(curr,max);
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
        System.out.println("Maximum 1's = "+max1s(arr));
    }
}

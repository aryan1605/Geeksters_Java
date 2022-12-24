package Arrays;
import java.util.Scanner;

public class Trapping_RainWater {
    public static int getWater(int [] arr)
    {
        int n = arr.length;
        int res = 0;
        int [] lmax = new int[n];
        int [] rmax = new int[n];
        //Pre-Computing lmax
        lmax[0] = arr[0];
        for(int i = 1;i<n;i++)
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        //Pre-Computing rmax
        rmax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--)
            rmax[i] = Math.max(rmax[i+1],arr[i]);

        for(int i = 1;i<n-1;i++)
            res += Math.min(lmax[i],rmax[i]) - arr[i];

        return res;
        //Time Complexity : O(n)
        //Auxiliary Space : O(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Total Water = "+getWater(arr));
    }
}

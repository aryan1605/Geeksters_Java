package Arrays;
import java.util.*;

public class MaximumOccuringElement {
    public static int maxAppear(int [] left,int [] right)
    {
        int n = left.length;
        int [] freq  = new int[101];
        Arrays.fill(freq,0);
        for(int i = 0;i<n;i++)
        {
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int res = 0;
        for(int i = 1;i<100;i++)
        {
            freq[i] = freq[i-1] + freq[i];
            if(freq[i] > freq[res])
                res = i;
        }
        return res;
        // Time Complexity = O(n + max) where max = 100
        // Auxiliary Space = O(max)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] left = new int[n];
        int [] right = new int[n];
        for(int i = 0;i<n;i++)
        {
            left[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            right[i] = sc.nextInt();
        }
        System.out.println("Maximum Occuring Element = "+maxAppear(left,right));
    }
}

package SlidingWindow;
import java.util.*;

public class FirstNegativeNumber_SizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextLong();
        }
        int k = sc.nextInt();
        long [] neg_num = printFirstNegativeInteger(arr,arr.length,k);
        for(int i = 0;i<neg_num.length;i++)
        {
            System.out.print(neg_num[i]+" ");
        }
    }
    public static long[] printFirstNegativeInteger(long arr[], int N, int k)
    {
        long [] neg_num = new long[N-k+1];
        ArrayList<Long> neg_nos = new ArrayList<>();

        int i = 0,j = 0;
        while(j < N)
        {
            if(arr[j] < 0)
            {
                neg_nos.add(arr[j]);
            }
            if((j-i+1) < k)
            {
                j++;
            }
            else if((j-i+1) == k)
            {
                if(neg_nos.isEmpty())
                {
                    neg_num[i] = 0;
                }
                else
                {
                    neg_num[i] = neg_nos.get(0);
                    if(neg_nos.contains(arr[i]))
                    {
                        neg_nos.remove(0);
                    }
                }
                i++;
                j++;

            }
        }
        return neg_num;
    }
}

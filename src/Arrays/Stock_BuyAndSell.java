package Arrays;
import java.util.Scanner;

public class Stock_BuyAndSell {
    public static int maxProfit(int [] arr)
    {
        /* We will buy when the price of the stock in the graph goes on decresing at the bottom whereas we will sell the stock
           when the price goes on increasing at the peak. */
        int n = arr.length;
        int profit = 0;
        for(int i = 1;i<n;i++)
        {
            if(arr[i] > arr[i-1])
                profit += (arr[i] - arr[i-1]);
        }
        return profit;
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
        System.out.println("Maximum Profit = "+maxProfit(arr));
    }
}

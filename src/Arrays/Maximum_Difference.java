package Arrays;
import java.util.Scanner;

public class Maximum_Difference {
    public static int max_diff(int [] arr)
    {
        int n = arr.length,max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(max < (arr[j] - arr[i]))
                    max = arr[j] - arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Difference = "+max_diff(arr));
    }
}

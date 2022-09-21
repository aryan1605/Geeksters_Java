package Arrays;
import java.util.Scanner;

public class Move_Zeros_ToEnd {
    public static void Move_ZerosToEnd(int [] arr)
    {
        int n = arr.length,low = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
                low++;
            }
        }
        // Time Complexity : O(n)
        // Auxiliary Space : O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Move_ZerosToEnd(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

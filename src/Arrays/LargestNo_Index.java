package Arrays;
import java.util.Scanner;

public class LargestNo_Index {
    public static int Largest_Index(int [] arr)
    {
        // Maximum value of arr[j] - arr[i] such that j > i
        int n = arr.length;
        int minVal = arr[0],res = arr[1] - arr[0];
        for(int j = 1;j<n;j++)
        {
            res = Math.max(res,arr[j] - minVal);
            minVal = Math.min(minVal,arr[j]);
        }
        return res;
        // Time Complexity = Theta(n)
        // Auxiliary Space = Theta(1)
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
        System.out.println("Position of the Largest Number = "+(Largest_Index(arr)+1));
    }
}

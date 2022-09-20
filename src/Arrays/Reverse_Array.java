package Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void ReverseArray(int [] arr)
    {
        int low = 0,high = arr.length-1;
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        // Time Complexity = Theta(n)
        // Auxiliary Space = Theta(1) [Excluding the input array]
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
        System.out.println("Original Array :");
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        ReverseArray(arr);
        System.out.println("Reversed Array : ");
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}

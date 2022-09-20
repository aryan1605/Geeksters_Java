package Arrays;
import java.util.Scanner;

public class Remove_Duplicates {
    public static int ReverseDuplicates(int [] arr)
    {
        int n = arr.length,res = 1;
        for(int i = 1;i<n;i++)
        {
            if(arr[i] != arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
        // Time Complexity = O(n)
        // Auxiliary Space = O(1)
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
        System.out.println("Size = "+arr.length);
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        int updated_size = ReverseDuplicates(arr);
        System.out.println("Modified Array : ");
        System.out.println("Size = "+updated_size);
        for(int i = 0;i<updated_size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

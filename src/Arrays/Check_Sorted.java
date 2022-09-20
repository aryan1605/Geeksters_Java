package Arrays;
import java.util.Scanner;

public class Check_Sorted {

    public static boolean CheckSorted(int [] arr)
    {
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i] < arr[i-1])
            {
                return false;
            }
        }
        return true;
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
        if(CheckSorted(arr))
        {
            System.out.println("SORTED");
        }
        else
        {
            System.out.println("NOT SORTED");
        }
    }
}

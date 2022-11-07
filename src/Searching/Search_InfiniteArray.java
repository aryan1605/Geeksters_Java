package Searching;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Search_InfiniteArray {
    public static int BS1(int [] arr,int x,int start,int end) // Iterative Method
    {

        while(start <= end)
        {
            int mid = start + ((end - start) / 2);
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
        // Time Complexity = O(log n)
        // Auxiliary Space = O(1)
    }
    public static int Search(int [] arr,int x)
    {
        // Algorithm : Unbounded Binary Search
        if(arr[0] == x)
            return 0;
        int i = 1;
        while(arr[i] < x)
            i *=2;
        if(arr[i] == x)
            return i;
        return BS1(arr,x,i/2+1,i-1);
        // Time Complexity = O(log(pos)) where pos is the position of the element if present.
        // Auxiliary Space = O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = i+1;
        }
        System.out.println("Enter the element need to be found : ");
        int x = sc.nextInt();
        int pos = Search(arr,x);
        if(pos != -1)
            System.out.println("Element is fount at position "+(pos+1));
        else
            System.out.println("Element is not found.");
    }
}

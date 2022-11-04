package Searching;
import java.util.Scanner;

public class Binary_Search_1 {
    // For Successful Searches = O(log2(n))
    // For Unsuccessful Searches = Theta(log2(n))
    public static int BS1(int [] arr,int x) // Iterative Method
    {
        int start = 0,end = arr.length-1;
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
    public static int BS2(int [] arr,int start,int end,int x) // Recursive Method
    {
        if(start > end)
            return -1;

        int mid = start + ((end - start) / 2);
        if(arr[mid] == x)
            return mid;
        else if(x > arr[mid])
            return BS2(arr,mid+1,end,x);
        else
            return BS2(arr,start,mid-1,x);
        // Time Complexity = O(log n)
        // Auxiliary Space = O(log n)
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
        System.out.println("Enter the element to be found : ");
        int x = sc.nextInt();
        // Iterative Method
        if(BS1(arr,x) != -1)
            System.out.println("Element found at position "+(BS1(arr,x)+1));
        else
            System.out.println("Element Not Found");
        // Recursive Method
        if(BS2(arr,0,arr.length-1,x) != -1)
            System.out.println("Element found at position "+(BS2(arr,0,arr.length-1,x)+1));
        else
            System.out.println("Element Not Found");
    }
}

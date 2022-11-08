package Searching;
import java.util.Scanner;

public class Search_SortedRotated {
    public static int BS1(int [] arr,int x)
    {
        int low = 0,end = arr.length-1;
        while(low <= end) {
            int mid = low + (end - low) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > arr[low]) {
                if (arr[low] <= x && x < arr[mid])
                    end = mid - 1;
                else
                    low = mid + 1;
            } else {
                if(x > arr[mid] && x <= arr[end])
                 low = mid+1;
                 else
                 end = mid-1;
            }
        }
        return -1;
        // Time Complexity = O(log n)
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
        System.out.println("Enter the element to be found : ");
        int x = sc.nextInt();
        if(BS1(arr,x) != -1)
            System.out.println("Element found at position "+(BS1(arr,x)+1));
        else
            System.out.println("Element Not Found");
    }
}

package Searching;
import java.util.Scanner;

public class Frequency {
    public static int First_Occurence(int [] arr,int low,int end,int x)
    {
        while(low <= end)
        {
            int mid = low + (end - low)/2;
            if(arr[mid] < x)
            {
                low = mid+1;
            }
            else if(arr[mid] > x)
                end = mid - 1;
            else
            {
                if(mid == 0 || arr[mid] != arr[mid-1])
                    return mid;
                else
                    end= mid - 1;
            }
        }
        return -1;
        // Time Complexity = O(log n)
        // Auxiliary Space = O(1)
    }
    public static int Last_Occurence(int [] arr,int low,int end,int x)
    {
        while(low <= end)
        {
            int mid = low + (end - low)/2;
            if(arr[mid] < x)
            {
                low = mid+1;
            }
            else if(arr[mid] > x)
                end = mid - 1;
            else
            {
                if(mid == arr.length-1 || arr[mid] != arr[mid+1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
        // Time Complexity = O(log n)
        // Auxiliary Space = O(1)
    }
    public static int Total_Occurences(int [] arr,int x)
    {
        int first = First_Occurence(arr,0,arr.length-1,x);
        if(first == -1)
            return 0;
        else
            return (Last_Occurence(arr,0,arr.length-1,x) - first + 1);
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
        System.out.println("Enter the element whose frequency need to be found : ");
        int x = sc.nextInt();
        int freq = Total_Occurences(arr,x);
        if(freq != 0)
            System.out.println("Total Occurences of element = "+freq);
        else
            System.out.print("Element is not present.");
    }
}

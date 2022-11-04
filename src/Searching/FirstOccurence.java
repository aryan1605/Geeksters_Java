package Searching;
import java.util.Scanner;

public class FirstOccurence {
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
        int pos = First_Occurence(arr,0,n-1,x);
        if(pos != -1)
            System.out.println("First Occurence of element is found at position "+(pos+1));
        else
            System.out.print("Element Not Found");
    }
}

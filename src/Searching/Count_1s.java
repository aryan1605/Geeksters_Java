package Searching;

import java.util.Scanner;

public class Count_1s {
    public static int Total_Occurences(int [] arr,int x)
    {
        int low = 0,end = arr.length-1;
        while(low <= end)
        {
            int mid = low + (end - low)/2;
            if(arr[mid] == 0)
            {
                 low = mid+1;
            }
            else
            {
                if(mid == 0 || arr[mid-1] == 0)
                    return (arr.length - mid);
                else
                    end = mid - 1;
            }
        }
        return 0;
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
            System.out.println("Total Occurences of 1 = "+freq);
        else
            System.out.print("1 is not present at all.");
    }
}

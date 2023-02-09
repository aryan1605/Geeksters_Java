package Sorting;
import java.util.Scanner;

public class Merger_ThreePointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        int low = sc.nextInt();
        int high = sc.nextInt();

        int mid = low + (high - low) / 2;

        merger(arr,low,mid,high);

        for(int ele : arr)
            System.out.print(ele + " ");
    }
    public static void merger(int [] arr,int low,int mid,int high)
    {
        // Setting up Auxiliary Arrays
        int n1 = mid-low+1,n2 = high - mid;
        int [] left = new int[n1];
        int [] right = new int[n2];

        for(int i = 0;i<n1;i++)
            left[i] = arr[i+low];
        for(int i = 0;i<n2;i++)
            right[i] = arr[mid+i+1];


        // Standard Merge Logic
        int i = 0,j = 0,k = low;
        while(i<n1 && j<n2)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i];
                i++;
            }
            else
            {
                arr[k++] = right[j];
                j++;
            }
        }
        while(i<n1)
        {
            arr[k++] = left[i];
            i++;
        }
        while(j<n2)
        {
            arr[k++] = right[j];
                    j++;
        }

        // Time Complexity : O(N)
        // Auxiliary Space : O(N)
        // N = n1 + n2
    }
}

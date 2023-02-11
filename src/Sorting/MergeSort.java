package Sorting;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        mergesort(arr,0,n-1);

        for(int ele : arr)
            System.out.print(ele+" ");
    }
    public static void mergesort(int [] arr,int l,int r)
    {
        if(l < r)
        {
            int mid = l + (r-l)/2; // To avoid OverFlow
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merger(arr,l,mid,r);
        }
        // Time Complexity : O(N * logN)
        // Auxiliary Space : O(N)
        // N = length of "arr"
    }
    public static void merger(int [] arr,int l,int mid,int r)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int [] left = new int[n1];
        int [] right = new int[n2];

        for(int i = 0;i<n1;i++)
            left[i] = arr[l+i];
        for(int i = 0;i<n2;i++)
            right[i] = arr[mid+i+1];

        int i = 0,j = 0,x = l;
        while(i<n1 && j <n2)
        {
            if(left[i] <= right[j])
            {
                arr[x++] = left[i];
                i++;
            }
            else
            {
                arr[x++] = right[j];
                j++;
            }
        }
        while(i<n1)
        {
            arr[x++] = left[i];
            i++;
        }
        while(j<n2)
        {
            arr[x++] = right[j];
            j++;
        }

        // Time Complexity : O(n)
        // Auxiliary Space : O(n)
        // n = n1 + n2
    }
}

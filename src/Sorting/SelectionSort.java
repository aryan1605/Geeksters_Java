package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selection_sort(int [] arr)
    {
        //Selection Sort is an unstable sorting algorithm.
        //It is the basic idea for HeapSort.
        //Time Complexity : O(n^2)
        //Auxiliary Space : O(1)

        int n = arr.length;
        for(int i = 0;i<n-1;i++)
        {
            int min_ele = arr[i];
            int min_pos = i;
            for(int j = i+1;j<n;j++)
            {
                if(min_ele > arr[j])
                {
                    min_pos = j;
                    min_ele = arr[j];
                }
            }
            /*
               If the min_pos is equal to ith position, it means the minimum element lies at the ith position.
               So, no swapping is needed.
             */
            if(min_pos != i)
            {
                arr[min_pos] = arr[i];
                arr[i] = min_ele;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        selection_sort(arr);
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

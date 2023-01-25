package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertion_sort(int [] arr)
    {
        // Insertion Sort is a stable sorting algorithm.
        // Time Complexity : O(n^2)
        /*
            Best Case : When array is sorted in ascending order.
                        Time Complexity : Theta(n)

            Worst Case : When array is sorted in descending order.
                         Time Complexity : Theta(n^2)

            In General : Time Complexity : O(n^2)
         */
        // Auxiliary Space : O(1)
        /*
            This sorting algorithm divides the array into a sorted and unsorted array,
            each element from the unsorted array is picked and get placed at its right position
            in the sorted array.
         */
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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
        insertion_sort(arr);
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

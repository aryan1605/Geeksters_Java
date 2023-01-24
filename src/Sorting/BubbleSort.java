package Sorting;
import java.util.Scanner;

public class BubbleSort {
    public static void bubble_sort(int [] arr)
    {
        //Bubble Sort is a stable sorting algorithm.
        //Time Complexity : O(n^2)
        //Auxiliary Space : O(1)
        /*
           The 'flag' variable denotes whether swapping is done in the array atleast one time after every pass.
           If no swapping is done, it means that the array is sorted or vice-versa.
         */
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            boolean flag = false;
            for(int j = 0;j<n-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag == false)
                break;
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
        bubble_sort(arr);
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

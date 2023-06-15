package Sorting;
import java.util.*;

public class Partition_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        int l = sc.nextInt();
        int r = sc.nextInt();
        int p = sc.nextInt();
        System.out.println("After Partition");
        Naive_Partition(arr,l,r,p);
        int pivot_index = Lomuto_Partition(arr,l,r,p);
        System.out.println(pivot_index);
        for(int ele : arr)
            System.out.print(ele + " ");

    }
    public static void Naive_Partition(int [] arr,int start,int end,int pos)
    {
        int [] temp = new int[end - start + 1];
        int index = 0;
        for(int i = start;i<=end;i++)
        {
            if(arr[i] < arr[pos])
                temp[index++] = arr[i];
        }
        for(int i = start;i<=end;i++)
        {
            if(arr[i] == arr[pos])
                temp[index++] = arr[i];
        }
        for(int i = start;i<=end;i++)
        {
            if(arr[i] > arr[pos])
                temp[index++] = arr[i];
        }
        for(int i = 0;i< temp.length;i++)
            arr[i + start] = temp[i];

        // Time Complexity : O(N)
        // Auxiliary Space : O(N)
        // N = end - start + 1
    }
    public static int Lomuto_Partition(int [] arr,int start,int end,int pivot_index)
    {
        if(pivot_index != end) // if pivot_index is not the last index, then it will be swapped with the last element.
            swap(arr,pivot_index,end);

        int pivot = arr[end]; // Last element will always be considered as pivot element
        int i = start-1;
        for(int j = start;j<=end-1;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return (i+1);

        // Time Complexity : O(N)
        // Auxiliary Space : O(1)
        // N = end - start
    }
    public static void swap(int [] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

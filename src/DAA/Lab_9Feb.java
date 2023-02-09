package DAA;
import java.util.*;

// Quick and Radix Sort
public class Lab_9Feb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        quicksort(arr,0,n-1);

        for(int ele : arr)
            System.out.print(ele+" ");
    }
    public static void quicksort(int [] arr,int start,int end)
    {
      if(start < end)
      {
          int pivot_pos = partition(arr,start,end);
          quicksort(arr,start,pivot_pos-1);
          quicksort(arr,pivot_pos,end);
      }
    }
    public static int partition(int [] arr,int start,int end)
    {
        int pivot_ele = arr[end];
        int i = start-1;
        for(int j = start;j<= end;j++)
        {
            if(arr[j] < pivot_ele)
            {
                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
//        int temp = arr[i+1];
//        arr[i+1] = arr[end];
//        arr[end] = temp;

        return (i+1);
    }
    public static void swap(int [] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

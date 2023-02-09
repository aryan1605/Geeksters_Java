package DAA;
import java.util.Scanner;

// Bubble , Selection, Insertion and Merge Sort
public class Lab_2Feb {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            //selection_sort(arr);
            //bubble_sort(arr);
            merge_sort(arr,0,n-1);
            for(int ele : arr)
            {
                System.out.print(ele+" ");
            }
        }
//     public static void selection_sort(int [] arr)
//     {
//         // Time Complexity : O(n^2)
//         // Auxiliary Space : O(1)
//       int n = arr.length;
//       for(int i = 0;i<n-1;i++)
//       {
//           int min = arr[i];
//           int min_index = i;
//           for(int j = i+1;j<n;j++)
//           {
//               if(arr[j] < min)
//               {
//                   min = arr[j];
//                   min_index = j;
//               }
//           }
//           arr[min_index] = arr[i];
//           arr[i] = min;
//       }
// }

//  public static void bubble_sort(int [] arr)
//  {
//      int n = arr.length;
//      for(int i = 1;i<=n-1;i++)
//      {
//          boolean flag = false;
//          for(int j = 0;j<n-i;j++)
//          {
//              if(arr[j] > arr[j+1])
//              {
//                  flag = true;
//                  int temp = arr[j];
//                  arr[j] = arr[j+1];
//                  arr[j+1] = temp;
//              }
//          }
//          if(flag == false)
//           break;
//      }
//  }

        public static void merge_sort(int [] arr,int start,int end)
        {
            if(start >= end)
            {
                return;
            }

            int mid = start + (end - start) / 2;

            merge_sort(arr,start,mid);
            merge_sort(arr,mid+1,end);
            merger(arr,start,mid,end);
        }

        public static void merger(int [] arr,int start,int mid,int end)
        {
            if(start >= end)
                return;

            int [] merge = new int[(end - start + 1)];


            int j = mid+1,x = 0;;
            while(start <= mid && j <= end)
            {
                if(arr[start] < arr[j])
                {
                    merge[x++] = arr[start];
                    start++;
                }
                else
                {
                    merge[x++] = arr[j];
                    j++;
                }
            }
            for(;start < mid;start++)
                merge[x++] = arr[start];

            for(;j < end;j++)
                merge[x++] = arr[j];

            x = 0;
            for(int i = start;i<=end;i++)
                arr[i] = merge[x++];
        }

  // Quick sort
}

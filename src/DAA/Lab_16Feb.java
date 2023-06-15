//package DAA;
//import java.util.*;
//// Counting and Radix Sort
//public class Lab_16Feb {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int [] arr = new int[n];
//
//        for(int i = 0;i<n;i++)
//            arr[i] = sc.nextInt();
//
//        countingsort(arr,n);
//
//        for(int ele : arr)
//            System.out.println(ele+" ");
//
//        public static int [] countingSort(int [] vec,int n)
//        {
//            HashMap<Integer, Integer> count = new HashMap<>();
//
//            // Here we are initializing every element of count to 0
//            // from 1 to n
//            int i;
//            for (i = 0; i < n; i++)
//                count.put(i,0);
//
//            // Here we are storing count of every element
//            for (i = 0; i < n; i++)
//            {
//                if(count.containsKey(vec[i]))
//                    count.put(vec[i],count.get(vec[i])+1);
//                else
//                    count.put(vec[i],1);
//            }
//            int [] sortedArr = new;
//            i = 0;
//            while (n > 0)
//            {
//
//                // Here we are checking if the count[element] = 0
//                // then incrementing for the next Element
//                if (count.get(i) == 0) {
//                    i++;
//                }
//
//                // Here we are inserting the element Integero the
//                // sortedArr decrementing count[element] and n by 1
//                else {
//                    sortedArr.add(i);
//                    count.put(i,count.get(i)-1);
//                    n--;
//                }
//            }
//            return sortedArr;
//        }
//    }
//
//
//
//}

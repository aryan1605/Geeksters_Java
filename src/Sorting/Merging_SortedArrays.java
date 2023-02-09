package Sorting;
import java.util.*;

public class Merging_SortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for(int i = 0;i<n1;i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for(int i = 0;i<n2;i++)
            arr2[i] = sc.nextInt();

        merger1(arr1,arr2); // Brute Force
        System.out.println();
        merger2(arr1,arr2); // Efficient
    }
    public static void merger1(int [] arr1,int [] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int [] arr3 = new int[n1+n2];
        for(int i = 0;i<n1;i++)
            arr3[i] = arr1[i];
        for(int i = 0;i<n2;i++)
            arr3[n1 + i] = arr2[i];

        Arrays.sort(arr3);

        for(int ele : arr3)
            System.out.print(ele+" ");

        // Time Complexity : O(N * logN)
        // Auxiliary Space : O(N)
        // N = n1 + n2
    }
    public static void merger2(int [] arr1,int [] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                /*
                    Here the "<=" is used to maintain stability.
                 */
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
        }

        // Time Complexity : O(N)
        // Auxiliary Space : O(1)
        // N = n1 + n2
    }
}

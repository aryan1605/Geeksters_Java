package Searching;

import java.util.Scanner;

public class Triplet_Search {
    public static boolean Pair_Search(int [] arr,int i,int x)
    {
        // Two pointer approach for sorted arrays.
        int j = arr.length-1;
        while(i < j)
        {
            if((arr[i] + arr[j]) == x)
                return true;
            else if((arr[i] + arr[j]) > x)
                j--;
            else
                i++;
        }
        return false;
        //Time Complexity = O(n)
        //Auxiliary Space = O(1)
    }
    public static boolean Triplet_Search(int [] arr,int x)
    {
        int n = arr.length;
        for(int i = 0;i<n-2;i++)
        {
            if(Pair_Search(arr,i+1,x-arr[i]))
                return true;
        }
        return false;
        //Time Complexity = O(n^2)
        //Auxiliary Space = O(1)
        /* It will take O(n^2) time complexity even if array is unsorted, as we can sort the array in O(nlogn) time complexity,
          therefore the overall time complexity will be O(n^2).
        */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose triplet need to be found : ");
        int x = sc.nextInt();
        if(Triplet_Search(arr,x))
            System.out.println("Triplet is found.");
        else
            System.out.println("Triplet is not Found");
    }
}

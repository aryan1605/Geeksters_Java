package Searching;
import java.util.Scanner;

public class Pair_Search {
    public static boolean Pair_Search(int [] arr,int x)
    {
        // Two pointer approach for sorted arrays.
        // For unsorted arrays, it is recommended to use hashing that will take some auxiliary space.
        int i = 0,j = arr.length-1;
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
        System.out.println("Enter the element whose pair need to be found : ");
        int x = sc.nextInt();
        if(Pair_Search(arr,x))
            System.out.println("Pair is found.");
        else
            System.out.println("Pair is not Found");
    }
}

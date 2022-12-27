package Arrays;
import java.util.Scanner;

public class Majority_Element {
    public static int majority(int [] arr)
    {
        int n = arr.length;
        int count = 1,res = 0;
        // Finding the candidate
        for(int i = 1;i<n;i++)
        {
            if(arr[i] == arr[res])
                count++;
            else
                count--;
            if(count == 0)
            {
                res = i;
                count = 1;
            }
        }
        // Checking whether the candidate is actually a majority element or not.
        count = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == arr[res])
                count++;
        }
        if(count <= n/2)
            res = -1;
        return res;
        //Time Complexity : O(n)
        //Auxiliary Space : O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        if(majority(arr) != -1)
            System.out.println("Majority Element = "+arr[majority(arr)]);
        else
            System.out.println("No Majority Element Found.");
    }
}

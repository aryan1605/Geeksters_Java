package Arrays;
import java.util.Scanner;

public class Minimum_Flips {
    public static void minFlips(int [] arr)
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            if(arr[i] != arr[i-1])
            {
                if(arr[i] != arr[0])
                    System.out.print("From "+i+" to ");
                else
                    System.out.println(i-1);
            }
        }
        if(arr[0] != arr[n-1])
            System.out.println(n-1);
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
        minFlips(arr);
    }
}

package Arrays;
import java.util.Scanner;

public class LargestNo_Index {
    public static int Largest_Index(int [] arr)
    {
        int res = 0;
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[res] < arr[i])
            {
                res = i;
            }
        }
        return res;
        // Time Complexity = Theta(n)
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
        System.out.println("Position of the Largest Number = "+(Largest_Index(arr)+1));
    }
}

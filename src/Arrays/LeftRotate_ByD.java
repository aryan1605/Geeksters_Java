package Arrays;
import java.util.Scanner;

public class LeftRotate_ByD {
    public static void Left_Rotate_D(int [] arr,int D)
    {
        // Reversal Algorithm
        reverse(arr,0,D-1);
        reverse(arr,D,arr.length-1);
        reverse(arr,0,arr.length-1);
        // Time Complexity = Theta(n)
        // Auxiliary Space = Theta(1)
    }
    public static void reverse(int [] arr,int low,int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of D : ");
        int D = sc.nextInt();
        Left_Rotate_D(arr,D);
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}

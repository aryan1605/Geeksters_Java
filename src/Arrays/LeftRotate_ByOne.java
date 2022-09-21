package Arrays;
import java.util.Scanner;

public class LeftRotate_ByOne {
    public static void Left_Rotate_One(int [] arr)
    {
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1;i<n;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        // Time Complexity = Theta(n)
        // Auxiliary Space = Theta(1)
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
        Left_Rotate_One(arr);
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}

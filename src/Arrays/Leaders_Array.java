package Arrays;
import java.util.Scanner;

public class Leaders_Array {
    public static void print_Leaders1(int [] arr)
    {
        int n = arr.length;
        int curr_ldr = arr[n-1];
        System.out.print(curr_ldr+" ");
        for(int i = n-2;i >= 0;i--)
        {
            if(arr[i] > curr_ldr)
            {
                curr_ldr = arr[i];
                System.out.print(curr_ldr+" ");
            }
        }
        // This Solution prints all the leaders in reverse order.
        // Time Complexity => Theta(n)
        // Auxiliary Space => Theta(1)
    }
    public static void ReverseArray(int [] arr)
    {
        int low = 0,high = arr.length-1;
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        // Time Complexity = Theta(n)
        // Auxiliary Space = Theta(1) [Excluding the input array]
    }
    public static void print_Leaders2(int [] arr)
    {
        int n = arr.length;
        int [] leaders = new int[n];
        int curr_ldr = arr[n-1],x = 0;
        leaders[x++] = curr_ldr;
        for(int i = n-2;i >= 0;i--)
        {
            if(arr[i] > curr_ldr)
            {
                curr_ldr = arr[i];
                leaders[x++] = curr_ldr;
            }
        }
        ReverseArray(leaders);
        for(int i = 0;i<n;i++)
        {
            if(leaders[i] != 0)
            System.out.print(leaders[i]+" ");
        }
        // This solution prints all the leaders in order.
        // Time Complexity => Theta(n)
        // Auxiliary Space => Theta(n)
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
        System.out.println("Leaders are : In Reverse Order");
        print_Leaders1(arr);
        System.out.println();
        System.out.println("Leaders are : In Order");
        print_Leaders2(arr);
    }
}

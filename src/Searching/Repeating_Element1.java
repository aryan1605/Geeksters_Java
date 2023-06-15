package Searching;
import java.util.Scanner;

public class Repeating_Element1 {
    public static int Repeating_Element1(int [] arr)
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            if(arr[i-1] > arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        for(int i = 1;i<n;i++)
        {
            if(arr[i-1] == arr[i])
                return arr[i];
        }
        return arr[0];
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
        System.out.println("Repeating Element = "+Repeating_Element1(arr));
    }
}

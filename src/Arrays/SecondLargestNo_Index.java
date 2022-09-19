package Arrays;
import java.util.Scanner;

public class SecondLargestNo_Index {
    public static int SecondLargest_Index(int [] arr)
    {
       int n = arr.length,largest = 0,res = -1;
       for(int i = 1;i<n;i++)
       {
           if(arr[i] > arr[largest])
           {
               res = largest;
               largest = i;
           }
           else if(arr[i] != arr[largest])
           {
               if(res == -1 || arr[i] > arr[res])
                   res = i;
           }
       }
       return res;
       // Time Complexity = Theta(n)
       // Auxiliary Space = Theta(1)
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
        if(SecondLargest_Index(arr) != -1)
        System.out.println("Position of the Largest Number = "+(SecondLargest_Index(arr)+1));
        else
            System.out.println("NO SECOND LARGEST ELEMENT");
    }
}

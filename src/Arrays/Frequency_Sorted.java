package Arrays;
import java.util.Scanner;

public class Frequency_Sorted {
//    public static void printAllFrequencies(int [] arr)      (MY SOLUTION)
//    {
//        int n= arr.length;
//        int temp = arr[0];
//        int c = 1;
//        for(int i = 1;i < n;i++)
//        {
//            if(temp == arr[i])
//                c++;
//            else
//            {
//                System.out.println(temp+" "+c);
//                temp = arr[i];
//                c = 1;
//            }
//        }
//        System.out.println(temp+" "+c);
//    }
public static void printAllFrequencies(int [] arr)       //(GFG SOLUTION)
{
    int n= arr.length;
    int temp = arr[0];
    int c = 1;
    for(int i = 1;i < n;i++)
    {
        if(temp == arr[i])
            c++;
        else
        {
            System.out.println(temp+" "+c);
            temp = arr[i];
            c = 1;
        }
    }
    System.out.println(temp+" "+c);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Frequencies : ");
        printAllFrequencies(arr);
    }
}

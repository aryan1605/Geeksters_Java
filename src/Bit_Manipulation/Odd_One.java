package Bit_Manipulation;
import java.util.Scanner;

public class Odd_One {
    public static int OddOne(int [] arr)
    {
        // Using the Properties of XOR:
        // 1)  x ^ 0 = x
        // 2)  x ^ x = 0
        int res = 0,n = arr.length;
        for(int i = 0;i<n;i++) {
            res = res ^ arr[i];
        }
        return res;
        // Time Complexity = Theta(n);
        // Auxiliary Space = Theta(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
        arr[i] = sc.nextInt();
        System.out.println("Odd One Occuring Element : "+OddOne(arr));
    }
}

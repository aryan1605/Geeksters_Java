package Bit_Manipulation;
import java.util.Scanner;
public class Two_Odd_Occuring {
    public static void TwoOddOne(int [] arr,int n)
    {
        int XOR = 0,res1 = 0,res2 = 0;
        for(int i = 0;i<n;i++)
            XOR = XOR ^ arr[i];
        int sn = XOR & (~(XOR-1)); //Rightmost Set Bit
        for(int i = 0;i<n;i++)
        {
            if((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i]; //Group1 for numbers having '1' at the rightmost bit position of XOR.
            else
                res2 = res2 ^ arr[i]; //Group2 for numbers having '0' at the rightmost bit position of XOR.
        }
        System.out.print(res1+" "+res2);
        //Time Complexity = Theta(n)
        // Logic : 0 ^ 1 = 1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
       TwoOddOne(arr,n);
    }
}

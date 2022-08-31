package Recursion;
import java.util.Scanner;

public class Rope_Cutting_Problem {
    public static int MaxPieces(int n,int a,int b,int c)
    {
        if(n < 0)
        {
            return -1;
        }
        if(n == 0)
        {
            return 0;
        }
        int max = Math.max(Math.max(MaxPieces(n-a,a,b,c),MaxPieces(n-b,a,b,c)),MaxPieces(n-c,a,b,c));
        if(max == -1)
        {
            return -1;
        }
        return max+1;
        //Time Complexity = O(3^n)
        //This problem has a better solution using Dynamic Programming(DP).
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n,a,b,c : ");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int pieces = MaxPieces(n,a,b,c);
        if(pieces == -1)
        System.out.println("Maximum no. of pieces of the rope : NOT POSSIBLE");
        else
        System.out.println("Maximum no. of pieces of the rope : "+pieces);
    }
}

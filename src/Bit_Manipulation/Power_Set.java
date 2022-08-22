package Bit_Manipulation;
import java.util.Scanner;

public class Power_Set {
    public static void printAllSubSets(String s)
    {
       int n = s.length();
       int powSize = (int)Math.pow(2,n);
       for(int counter = 0;counter < powSize;counter++)
       {
           for(int j = 0;j<n;j++)
           {
               if((counter & (1 << j)) != 0) {
                   System.out.print(s.charAt(j));
               }
           }
           System.out.println();
       }
        //Time Complexity = Theta(2^n * n)
        //Note : The output will not be in the lexicographical order.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        printAllSubSets(str);
    }
}

package Recursion;
import java.util.Scanner;

public class Palindrome_String {
    public static boolean PalindromeString(String str,int start,int end)
    {
        if(start >= end)
        {
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && PalindromeString(str,start+1,end-1);
        //Time Complexity = O(n)
        //Recurrence Relation => T(n) = T(n-2) + Theta(1)
        //Auxiliary Space = O(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        if(PalindromeString(str,0,str.length()-1))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

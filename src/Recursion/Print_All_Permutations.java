package Recursion;
import java.util.Scanner;

public class Print_All_Permutations {
    public static void printAllPermutations(String str,int index)
    {
        if(index == str.length()-1)
        {
            System.out.print(str+" ");
            return;
        }
        for(int j = index;j<str.length();j++)
        {
            str = swap(str,index,j);//Fixing the character present at position 'j' , at the position 'index' in the given string 'str'.
            printAllPermutations(str,index+1);
            str = swap(str,j,index);// To get back the original string.
        }
    }
    private static String swap(String str,int source,int destination)
    {
        char [] ch = str.toCharArray();
        char temp = ch[source];
        ch[source] = ch[destination];
        ch[destination] = temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("All Permutations of String "+str+" are as follows : ");
        printAllPermutations(str,0);
    }
}

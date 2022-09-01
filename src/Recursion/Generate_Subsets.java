package Recursion;
import java.util.Scanner;

public class Generate_Subsets {
    public static void GenerateSubsets(String str,String current,int index)
    {
      if(index == str.length())
      {
          // At this index, our all subsets are ready.Now we have to print them and return.
          System.out.println(current);
          return;
      }
      GenerateSubsets(str,current,index+1);//Not Included
      GenerateSubsets(str,current+str.charAt(index),index+1);//Included
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        GenerateSubsets(str,"",0);
    }
}

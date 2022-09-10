package Recursion;
import java.util.Scanner;

public class Keypad_Combination {
    static String [] pattern = {"1","2","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static String [] possible_words(int [] a,int N,int index)
    {
        if(index == N-1)
        {
            String str = pattern[a[index]];
            String [] ch = new String[str.length()];
            for(int i = 0;i<str.length();i++)
            {
                ch[i] = str.charAt(i) + "";
            }
            return ch;
        }
        int x = 0;

        String str = pattern[a[index]];
        String [] ch = possible_words(a,N,index+1);
        String [] result = new String[str.length() * ch.length];
        for(int i = 0;i<str.length();i++)
        {
            for (String s : ch) {
                result[x++] = str.charAt(i) + s;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] phone_digits = new int[n];
        System.out.println("Enter the phone digits");
        for(int i = 0;i<n;i++)
        {
            phone_digits[i] = sc.nextInt();
        }
        System.out.println("All Possible Keypad Combinations : ");
        String [] keypad = possible_words(phone_digits,n,0);
        for (String s : keypad) {
            System.out.print(s + " ");
        }
    }
}

package CP_JAVA;
import java.util.Scanner;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        int n = s.length();
        int i = 0,j = n-1;
        while(i < j)
        {
            String str1 = s.charAt(i) + "";
            String str2 = s.charAt(j) + "";
            if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j)))
            {
                if(str1.equalsIgnoreCase(str2))
                {
                    i++;
                    j--;
                }
                else
                    return false;
            }
            else if(Character.isLetter(s.charAt(i)) && !Character.isLetter(s.charAt(j)))
            {
                j--;
            }
            else if(!Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j)))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}

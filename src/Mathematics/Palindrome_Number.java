package Mathematics;

import java.util.Scanner;

public class Palindrome_Number {
    public static boolean Check_Palindrome(long n)
    {
        if(n <= 9)
        {
            return true;
        }
        long rev = 0,num = n;
        while(num != 0)
        {
            long ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }
        return (rev == n);
        //Time Complexity = Theta(d) where d is the number of digits in number 'n'.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        long n = sc.nextLong();
        if(Check_Palindrome(n))
            System.out.println("It is a Palindrome Number.");
        else
            System.out.println("It is not a Palindrome Number.");
    }
}

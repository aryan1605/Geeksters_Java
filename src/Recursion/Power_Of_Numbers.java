package Recursion;
import java.util.Scanner;

public class Power_Of_Numbers {
    public static long power(int N,int R)
    {
        if(R == 0)
        {
            return 1L;
        }
        else if(R == 1)
        {
            return N;
        }
        int M = 1000000007;
        long smallAns = power(N,R/2) % M;
        smallAns = (smallAns * smallAns) % M;

        if(R % 2 == 1)
        {
            smallAns = smallAns * (N % M);
        }
        return smallAns % M;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        String str = String.valueOf(N);
        int i = 0,j = str.length()-1;
        while(i < j)
        {
            str = swap(str,i,j);
            i++;
            j--;
        }
        int R = Integer.parseInt(str);
        System.out.println(" N^R : "+power(N,R));
    }
    private static String swap(String str,int source,int destination)
    {
        char [] ch = str.toCharArray();
        char temp = ch[source];
        ch[source] = ch[destination];
        ch[destination] = temp;
        return String.valueOf(ch);
    }
}

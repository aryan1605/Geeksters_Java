package CP_JAVA;
import java.util.*;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<= t;i++)
        {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(Original_String(s,n));
        }
    }
    public static int Original_String(String str,int n)
    {
        if(str.charAt(0) == str.charAt(n-1))
            return n;

        int i = 0,j = n-1;
        while(i < j)
        {
          if(str.charAt(i) != str.charAt(j))
          {
              str = str.substring(i+1,j);
              i = 0;
              j = str.length()-1;
          }
          else
              break;
        }
        return str.length();
    }
}

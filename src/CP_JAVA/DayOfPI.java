package CP_JAVA;
import java.util.Scanner;

public class DayOfPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1;i<=t;i++)
        {
            String str = sc.next();
            int count = Precision(str);
            System.out.println(count);
        }
    }
    public static int Precision(String str)
    {
        if(str.length() == 0 || str.charAt(0) != '3')
            return 0;

      String pis = "3141592653589793238462643383279";

        int count = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) == pis.charAt(i))
                count++;
            else
                break;
        }
        return count;
    }
}

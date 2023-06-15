package CP_JAVA;
import java.util.Scanner;

public class Following_Directions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            String str = sc.next();
            if(Passing_Candy(n,str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean Passing_Candy(int n,String str)
    {
        int x = 0,y = 0;
        for(int i = 0;i<n;i++)
        {
            if(x == 1 && y == 1)
                return true;

            char ch = str.charAt(i);
            if(ch == 'L')
            {
                x--;
            }
            else if(ch == 'R')
            {
                x++;
            }
            else if(ch == 'U')
            {
                y++;
            }
            else
            {
                y--;
            }
        }
        if(x == 1 && y == 1)
            return true;

        return false;
    }
}

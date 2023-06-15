package CP_JAVA;
import java.util.*;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = "codeforces";
        ArrayList<Character> check = new ArrayList<>();
        for(int i = 0;i<str.length();i++)
        {
            check.add(str.charAt(i));
        }
        for(int i = 1;i <= t;i++)
        {
            String ch = sc.next();
            if(check.contains(ch.charAt(0)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

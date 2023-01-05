package Arrays;
import java.util.Scanner;

public class Equilibrium_Point {
    public static boolean eqPoint(int [] arr)
    {
        int n = arr.length;
        int rs = arr[0];
        for(int i = 1;i<n;i++)
            rs += arr[i];

        int ls = 0;
        for(int i = 0;i<n;i++)
        {
            rs -= arr[i];
            if(ls == rs)
                return true;
            ls += arr[i];
        }
        return false;
        //Time Complexity : O(n)
        //Auxiliary Space : O(1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equilibrium Point = "+eqPoint(arr));
    }
}

package CP_JAVA;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[101];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position and value to be inserted");
        int p1 = sc.nextInt();
        int v1 = sc.nextInt();
        n = insert(arr,101,n,p1,v1);
        display(arr,n);
        System.out.println("Enter the position at which the element is to be deleted");
        int p2 = sc.nextInt();
        n = delete(arr,p2,n);
        display(arr,n);
        System.out.println("Enter the element to be searched");
        int v2 = sc.nextInt();
        if(linear_search(arr,v2,n)) {
            System.out.println("Present");
        } else
            System.out.println("Not Present");
    }
    public static boolean linear_search(int [] arr,int x,int n)
    {

        for(int i = 0;i<n;i++)
        {
            if(arr[i] == x)
                return true;
        }
        return false;
    }
    public static void display(int [] arr,int n)
    {
        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int insert(int [] arr,int cap,int n,int pos,int x)
    {
        if(n == cap)
            return n;
        else if(pos == n)
        {
            arr[n] = x;
            return n+1;
        }

        for(int i = n;i>pos;i--)
            arr[i] = arr[i-1];

        arr[pos] = x;

        return n+1;
    }
    public static int delete(int [] arr,int pos,int n)
    {
        if(pos >=n)
        {
            return n;
        }
        else if(pos == n-1)
        {
            return n-1;
        }
        for(int i = pos;i<n-1;i++)
            arr[i] = arr[i+1];

        return n-1;
    }
}

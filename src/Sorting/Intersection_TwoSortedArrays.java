package Sorting;
import java.util.Scanner;

public class Intersection_TwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for(int i = 0;i<n1;i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for(int i = 0;i<n2;i++)
            arr2[i] = sc.nextInt();

        intersection1(arr1,arr2); // Brute Force
        System.out.println();
        intersection2(arr1,arr2);
    }
    public static void intersection1(int [] a,int [] b)
    {
        for(int i = 0;i<a.length;i++)
        {
            if(i > 0 && a[i] == a[i-1])
                continue;
            for(int j = 0;j<b.length;j++)
            {
                if(a[i] == b[j])
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        // Time Complexity : O(a.length * b.length)
        // Auxiliary Space : O(1)
    }
    public static void intersection2(int [] a,int [] b)
    {
        int n1 = a.length;
        int n2 = b.length;

        int [] c = new int[n1+n2];

        int i = 0,j = 0,x = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                /*
                    Here the "<=" is used to maintain stability.
                 */
                c[x++] = a[i];
                i++;
            } else {
                c[x++] = b[j];
                j++;
            }
        }
        while (i < n1) {
            c[x++] = a[i];
            i++;
        }
        while (j < n2) {
            c[x++] = b[j];
            j++;
        }

        boolean flag = false;
            for(int l = 1;l<c.length;l++)
            {
                if(c[l] == c[l-1])
                    flag = true;
                else if(flag)
                {
                    System.out.print(c[l-1]+" ");
                    flag = false;
                }
            }
            if(flag)
                System.out.print(c[c.length-1]);
    }
}

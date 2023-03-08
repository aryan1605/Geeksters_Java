package Matrix;

import java.util.Scanner;

public class PrintMatrix_Boundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int r = sc.nextInt();
        System.out.println("Enter columns : ");
        int c = sc.nextInt();

        int [][] arr = new int[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        BoundaryPattern(arr);
    }
    public static void BoundaryPattern(int [][] arr)
    {
        int r = arr.length,c = arr[0].length;
        if(r == 1)
        {
            for(int i = 0;i<c;i++) // ---------> c times
                System.out.print(arr[0][i]+" ");
        }
        else if(c == 1)
        {
            for(int i = 0;i<r;i++) // ----------> r times
                System.out.print(arr[i][0]+" ");
        }
        else
        {
            for(int i = 0;i<c;i++)   // ---------> c times
                System.out.print(arr[0][i]+" ");
            for(int i = 1;i<r;i++)  // ----------> r-1 times
                System.out.print(arr[i][c-1]+" ");
            for(int i = c-2;i>=0;i--) // --------> c-1 times
                System.out.print(arr[r-1][i]+" ");
            for(int i = r-2;i>=1;i--) // --------> r-3 times
                System.out.print(arr[i][0]+" ");
        }
        // Time Complexity : O(r + c)
        // Auxiliary Space : O(1)
    }
}

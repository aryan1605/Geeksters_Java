package Matrix;

import java.util.Scanner;

public class Rotate_Matrix90 {
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
        //Rotate90_1(arr); // Naive Solution
        Rotate90_2(arr); // Efficient Solution

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Rotate90_2(int [][] arr) // Efficient Solution
    {
        /*
            Since r == c, let's take r = c = n
         */
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<(n/2);j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }

        Tranpose(arr);

        // Time Complexity : O(n^2)
        // Auxiliary Space : O(1)
    }
    public static void Tranpose(int [][] arr)
    {
        /*
            Since r == c, let's take r = c = n
         */
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Time Complexity : O(n^2)
        // Auxiliary Space : O(1)
    }
    public static void Rotate90_1(int [][] arr) // Naive Solution
    {
        /*
            Since r == c, let's take r = c = n
         */
        int n = arr.length;
        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[n - j - 1][i] = arr[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = temp[i][j];
            }
        }
        // Time Complexity : O(n^2)
        // Auxiliary Space : O(n^2)
    }
}

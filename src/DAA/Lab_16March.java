package DAA;

import java.util.Scanner;

public class Lab_16March {

    //  Matrix Multiplication in O(n^2.81)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter columns1 : ");
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows2 : ");
        int r2 = sc.nextInt();
        System.out.println("Enter columns2 : ");
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int [][] A = Matrix_Multiplication1(arr1,arr2,r1,c1,r2,c2); // Naive Solution
        display(A);


    }
    public static int [][] Matrix_Multiplication1(int [][] A,int [][] B,int r1,int c1,int r2,int c2)
    {
        if(c1 != r2)
        {
            return new int[0][0];
        }

        int [][] multiply = new int[r1][c2];

        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c1;j++)
            {
                for(int k = 0;k<c2;k++)
                {
                    multiply[i][k] += (A[i][j] * B[j][k]);
                }
            }
        }
        return multiply;

        // Time Complexity : O(n^3)
        // Auxiliary Space : O(r1  *c2)
    }
    public static void display(int [][] A)
    {
        for(int i = 0;i<A.length;i++)
        {
            for(int j = 0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}

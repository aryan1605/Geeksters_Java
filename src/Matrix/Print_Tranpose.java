package Matrix;

import java.util.Scanner;

public class Print_Tranpose {
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
        Tranpose(arr);

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
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
}

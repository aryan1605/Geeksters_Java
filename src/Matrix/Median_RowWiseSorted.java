package Matrix;

import java.util.Scanner;

public class Median_RowWiseSorted {
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
        //System.out.println("Median = "+median1(arr)); // Naive Solution
        //System.out.println("Median = "+median2(arr));
    }
    public static void median1(int [][] arr) // Naive Solution
    {
        /*
             1) Create a 1-D array of size (r * c) and put all the elements of the matrix
                into it. ------>  O(r * c)

             2) Sort the array using a stable sorting algorithm. -----> O((r * c) * log(r * c))

             3) Find the median and return it ------> O(1).

             Time Complexity : O((r * c) * log(r * c))
             Auxiliary Space : O(r * c)
         */
    }
//    public static int median2(int [][] arr)
//    {
//
//    }
}

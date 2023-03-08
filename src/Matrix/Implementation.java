package Matrix;
import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows : ");
        int r = sc.nextInt();
        System.out.println("Enter columns :");
        int c = sc.nextInt();

        int [][] arr = new int[r][c]; // Initialization of a 2-D array

        System.out.println("Normal 2-D array");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr[i][j] = i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Jagged Array");
        Jagged_Arrays();
    }
    public static void Jagged_Arrays()
    {
        // Suppose we take rows : 3
        /*
           For initialization of 2-D arrays, no of rows is mandatory to give
           and no of columns is optional to give (provided , we initialize the row_arrays).

           Jagged Arrays : Row_arrays are of different sizes.
         */
        int [][] arr = new int[3][];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = new int[i+1];
            for(int j = 0;j<arr[i].length;j++)
            {
                arr[i][j] = i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

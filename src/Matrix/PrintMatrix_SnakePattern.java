package Matrix;
import java.util.Scanner;

public class PrintMatrix_SnakePattern {
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
        SnakePattern(arr);
    }
    public static void SnakePattern(int [][] arr)
    {
        int r = arr.length,c = arr[0].length;
        for(int i = 0;i<r;i++)
        {
            if(i % 2 == 0)
            {
                for(int j = 0;j<c;j++)
                    System.out.print(arr[i][j] + " ");
            }
            else
            {
                for(int j = c-1;j>=0;j--)
                    System.out.print(arr[i][j]+" ");
            }
        }
//        Time Complexity : Theta(r * c)
//        Auxiliary Space : O(1)
    }
}

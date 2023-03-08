package Matrix;

import java.util.Scanner;

public class Matrix_SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int r = sc.nextInt();
        System.out.println("Enter columns : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        SpiralTraversal_ClockWise(arr);     //  Pepcoding Solution
        System.out.println();
        SpiralTraversal_AntiClockWise(arr); // Pepcoding Solution
    }
    public static void SpiralTraversal_ClockWise(int[][] arr) {

        int r = arr.length,c = arr[0].length;
        int min_r = 0,min_c = 0,max_r = r-1,max_c = c-1;
        int total_ele = r *  c;
        int count_ele = 0;
        while(count_ele < total_ele)
        {
            for(int i = min_c;i<=max_c && count_ele < total_ele;i++) {
                System.out.print(arr[min_r][i] + " ");
                count_ele++;
            }
            min_r++;

            for(int i = min_r;i<=max_r && count_ele < total_ele;i++) {
                System.out.print(arr[i][max_c] + " ");
                count_ele++;
            }
            max_c--;

            for(int i = max_c;i>=min_c && count_ele < total_ele;i--) {
                System.out.print(arr[max_r][i] + " ");
                count_ele++;
            }
            max_r--;

            for(int i = max_r;i>=min_r && count_ele < total_ele;i--) {
                System.out.print(arr[i][min_c] + " ");
                count_ele++;
            }
            min_c++;
        }
    }
    public static void SpiralTraversal_AntiClockWise(int[][] arr) {

       int r = arr.length,c = arr[0].length;
       int min_r = 0,min_c = 0,max_r = r-1,max_c = c-1;
       int total_ele = r *  c;
       int count_ele = 0;
       while(count_ele < total_ele)
       {
           for(int i = min_r;i<=max_r && count_ele < total_ele;i++) {
               System.out.print(arr[i][min_c] + " ");
               count_ele++;
           }
           min_c++;

           for(int i = min_c;i<=max_c && count_ele < total_ele;i++) {
               System.out.print(arr[max_r][i] + " ");
               count_ele++;
           }
           max_r--;

           for(int i = max_r;i>=min_r && count_ele < total_ele;i--) {
               System.out.print(arr[i][max_c] + " ");
               count_ele++;
           }
           max_c--;

           for(int i = max_c;i>=min_c && count_ele < total_ele;i--) {
               System.out.print(arr[min_r][i] + " ");
               count_ele++;
           }
           min_r++;
       }
    }
}
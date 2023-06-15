package DAA;
import java.util.*;

public class Sorting_Techniques {
    public static void selectionsort(int [] arr,int n)
    {
        for(int i = 0;i<n-1;i++)
        {
            int min_index = i;
            int min_ele = arr[i];
            for(int j = i+1;j<n;j++)
            {
                if(arr[j] < min_ele)
                {
                    min_index = j;
                    min_ele = arr[j];
                }
            }

            if(i != min_index)
            {
                arr[min_index] = arr[i];
                arr[i] = min_ele;
            }
        }
    }
    public static void bubblesort(int [] arr,int n) {
        for (int i = 1; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if(!flag)
                break;
        }
    }
    public static void insertionsort(int [] arr,int n)
    {
        if(n == 1)
            return;

        for(int i = 1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void mergesort(int [] arr,int l,int r)
    {
        if(l < r)
        {
            int mid = l + (r-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merger(arr,l,r,mid);
        }
    }
    public static void merger(int [] arr,int l,int r,int mid)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int [] left = new int[n1];

        for(int i = 0;i<n1;i++)
        {
            left[i] = arr[l+i];
        }

        int [] right = new int[n2];

        for(int i = 0;i<n2;i++)
        {
            right[i] = arr[mid+1+i];
        }

        int i = 0,j = 0,x = l;

        while(i<n1 && j <n2)
        {
            if(left[i] < right[j])
            {
                arr[x++] = left[i];
                i++;
            }
            else
            {
                arr[x++] = right[j];
                j++;
            }
        }
        for(;i<n1;i++)
        {
            arr[x++] = left[i];
        }
        for(;j<n2;j++)
        {
            arr[x++] = right[j];
        }
    }
    public static void quicksort(int [] arr,int l,int r)
    {
        if(l < r)
        {
            int pivot = Partition(arr,l,r);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,r);
        }
    }
    public static int Partition(int [] arr,int l,int r)
    {
        int pivot = arr[r];

        int i = l-1;

        for(int j = l;j<=r-1;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    public static void swap(int [] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static boolean linear_search(int [] arr,int n,int x)
    {
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == x)
                return true;
        }
        return false;
    }
    public static boolean binary_search(int [] arr,int n,int x)
    {
        int l = 0,r = n-1;

        while(l <= r)
        {
            int mid = l + (r-l)/2;

            if(arr[mid] == x)
                return true;
            else if(arr[mid] > x)
                l = mid+1;
            else
                r = mid-1;
        }
        return false;
    }
    public static int [] countingsort(int [] arr,int n)
    {
        int max = arr[0];
        for(int i = 1;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }

        int [] count = new int[max+1];

        for(int i = 0;i<n;i++)
        {
            count[arr[i]]++;
        }

        for(int i = 1;i<=max;i++)
        {
            count[i] = count[i] + count[i-1];
        }

        int [] output = new int[n];

        for(int i = n-1;i>=0;i--)
        {
            output[--count[arr[i]]] = arr[i];
        }

        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

//        selectionsort(arr,n);
//        bubblesort(arr,n);
//        insertionsort(arr,n);
//        mergesort(arr,0,n-1);
//        quicksort(arr,0,n-1);
        arr = countingsort(arr,n);
        display(arr);

        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

        System.out.println(binary_search(arr,n,x));
        System.out.println(linear_search(arr,n,x));
    }
    public static void display(int [] arr)
    {
        int n = arr.length;

        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

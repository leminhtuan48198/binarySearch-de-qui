
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int binarySearch(int arr[], int left, int right, int value)
    {
        if (right>=left) {

            int mid = left + (right - left)/2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, left, mid-1, value);
            return binarySearch(arr, mid+1, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,23,34,45,56,43,54,32,67};
         Arrays.sort(arr);
        for (int e:arr) {
            System.out.print(e+",");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nNhap gia tri muon tim");
        int value=scanner.nextInt();
        int index=binarySearch(arr,0,arr.length-1,value);
        System.out.println("Phan tu o vi tri "+index);
    }



}

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int search(int start,int end,int arr[],int a) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == a) {
                return mid;
            } else if (a <= arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr= {1,3,5,7,9};
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int start=0;
        int end= arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == a) {
                System.out.println(mid+1);
                break;
            } else if (a <= arr[mid]) {
                end = mid;
            } else
                start = mid + 1;
            }

//        System.out.println( search(start,end,arr,a));
        }
    }


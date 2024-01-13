import java.util.Arrays;

public class searching_and_sorting3 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,0,2,3,0,3};
        Arrays.sort(arr);
        for (int k : arr) {
            System.out.print(" " + k);
        }
        System.out.println();
        int x=1;
         x += arr[arr.length-1];
        System.out.println("max = " + x);
        int[] count = new int[x];
        for (int i = 0; i < x ; i++) {
            count[i] = 0;
        }
        for (int i=0;i< x;i++){
            System.out.print(count[i]);
        }
        for (int i = 0; i < x; i++) {
              count[arr[i]]++;
            }
        System.out.println();
        for (int i =0; i < x; i++) {
            System.out.print(" "+count[i]);
        }
    }
}

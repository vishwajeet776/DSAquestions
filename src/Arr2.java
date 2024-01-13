import java.security.DrbgParameters;
import java.util.Arrays;
import java.util.Scanner;

public class Arr2 {

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,-4};
        int a=0;
        for (int i=0;i< arr.length;i++) {
            for (int n = i; n < arr.length; n++) {
                int sum=0;
                for (int k=i;k<=n;k++){
                    sum+=arr[k];
                    if (sum>=a){
                        a=sum;
                }

                }

            }

        }
        System.out.print(" "+a);

    }
}

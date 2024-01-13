import java.util.Arrays;

//Maximum amd Minimum Element in an arr
public class Arr1 {
    public static void main(String[] args) {

        int arr[]={3,5,2,1,9};

        int max=arr[0];
        int min=arr[0];

        System.out.println(arr.length);
//        1st methode
        Arrays.sort(arr);
        System.out.println("Max is "+arr[0]+" , "+"Min is "+ arr[arr.length-1]);
//        2nd method
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]<=min){
                min=arr[i];
            }
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.println(min+ " "+" "+ max );

    }
}

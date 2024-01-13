public class Arr4 {
    public static boolean isDuplicate(int arr[]){
        for (int i=0;i<= arr.length-1;i++){
            for (int j=i+1;j< arr.length-1;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int arr[]={1,2,1,3,4};
      for (int i=0;i<= arr.length-1;i++){
          System.out.println(arr[i]);
      }

            if (isDuplicate(arr)){
                System.out.println("is duplicate");
            }
            else {
                System.out.println("no");
            }

    }
}

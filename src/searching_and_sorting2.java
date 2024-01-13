public class searching_and_sorting2 {
    public static void main(String[] args) {
        int arr[]={1,4,1,2,7,5,2};
        int a[]=new  int[9];

        for (int i=0;i< arr.length;i++){
            int x=0;
           for (int j=0;j< arr.length;j++){
               if(arr[i]==arr[j]){
                   x++;
                a[i]=x;
               }
           }
            System.out.println(x);
        }
    }
}

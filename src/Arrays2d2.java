import java.util.Scanner;
public class Arrays2d2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (arr[i][j]==0){
                    for (int x=0;x<n;x++){
                        arr[i][x]=0;
                    }
                    for (int x=0;x<n;x++){
                        arr[x][j]=0;
                    }
                }
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

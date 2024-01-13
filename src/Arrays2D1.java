import java.util.Scanner;

public class Arrays2D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 4;
        int arr[][] = new int[n][m];
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = c;
                System.out.print(" " + c + " ");
                c++;
            }
            System.out.println();
        }
        System.out.println("____________");
        for (int a = 0; a <= n * m; a++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == a) {
                        System.out.print(" " + arr[j][i] + " ");
                        break;
                    }
                }

            }
            System.out.println();
        }
    }
}



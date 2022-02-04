import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n++;
        int[][] a = new int[n][n];
//        Arrays.fill(a, 0);
        a[0][0] = 1;
        for (int i = 1; i < n; i++) {
            int id = 0;
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][id++] + a[i - 1][j];
                }
            }
        }
        // 1 0 0 0 -> row 0
        // 1 1 0 0 -> row 1
        // 1 2 1 0 -> row 2
        // id = 0
        // a[i][j] = a[i - 1][id] + a[i - 1][j]
        // 1 3 3 1 -> row 3
        long sum = 0;
        System.out.print("The row numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[n - 1][i] + " ");
            sum += a[n - 1][i];
        }
        System.out.println("\nThe total value is : " + sum);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[4];
        for (int i = 0; i < 4; i++) {
            b[i] = in.nextInt();
        }
        int[] res = new int[4];
        int id = 3;
        for (int i = 3; i >= 0; i--) {
            res[id--] = (a[i] + b[i]) % 10;
            if (i - 1 >= 0) {
                a[i - 1] += ((a[i] + b[i]) / 10);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
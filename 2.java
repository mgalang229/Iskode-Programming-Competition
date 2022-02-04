import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double[] a = new double[x];
        for (int i = 0; i < x; i++) {
            a[i] = 1 / (Math.pow(2, i + 1));
        }
        for (int i = x - 2; i >= 0; i--) {
            a[i] = Math.pow(a[i], a[i + 1]);
        }
        System.out.printf("%.10f", a[0]);
    }
}
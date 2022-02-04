import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 1 || i == n - 1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j <= i; j++) {
                    System.out.print(j == 0 || j == i ? "*" : " ");
                }
            }
            System.out.println();
        }
    }
}
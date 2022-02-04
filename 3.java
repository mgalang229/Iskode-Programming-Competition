import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String res = "";
        for (int i = 0; i < (int) input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                int x = ((input.charAt(i) - 'A') + 5) % 26;
                res += (char) ((char) 'A' + x);
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                int x = ((input.charAt(i) - 'a') + 5) % 26;
                res += (char) ((char) 'a' + x);
            } else {
                res += input.charAt(i);
            }
        }
        System.out.println(res.toUpperCase());
    }
}
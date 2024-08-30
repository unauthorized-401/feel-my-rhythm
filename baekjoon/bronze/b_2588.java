package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2588 {
    public static void main(String[] args) throws IOException {
        // 472
        // 385
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        int a = num1 * (num2 % 10);
        int b = num1 * ((num2 / 10) % 10);
        int c = num1 * (num2 / 100);
        int d = num1 * num2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

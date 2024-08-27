package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1330 {
    public static void main(String[] args) throws IOException {
        // 1 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int num1 = Integer.parseInt(token.nextToken());
        int num2 = Integer.parseInt(token.nextToken());

        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

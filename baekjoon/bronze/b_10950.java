package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i ++) {
            StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            System.out.println(a+b);
        }
    }
}

package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int result = 0;

        for (int i = 0; i < n; i ++) {
            StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
            int price = Integer.parseInt(token.nextToken());
            int count = Integer.parseInt(token.nextToken());
            result += price * count;
        }

        if (total == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

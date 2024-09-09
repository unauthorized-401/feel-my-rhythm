package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        // 바구니 수, 공 번호
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int[] buckets = new int[n+1];

        for (int i = 0; i < m; i++) {
            token = new StringTokenizer(reader.readLine(), " ");

            // a 바구니부터 b 바구니까지 c번 공을 넣는다.
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            for (int j = a; j <= b; j++) {
                buckets[j] = c;
            }
        }

        for (int k = 1; k <= n; k++) {
            if (k == n) {
                writer.write(buckets[k] + "\n");
            } else {
                writer.write(buckets[k] + " ");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

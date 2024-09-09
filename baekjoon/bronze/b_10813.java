package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        // 바구니 수, 공 번호
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int[] buckets = new int[n+1];

        // 초반 공 세팅
        for (int i = 0; i <= n; i++) {
            buckets[i] = i;
        }

        for (int j = 0; j < m; j++) {
            token = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            // 공 교환
            int temp = buckets[a];
            buckets[a] = buckets[b];
            buckets[b] = temp;
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

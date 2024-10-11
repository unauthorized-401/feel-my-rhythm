package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());
        int index = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                index += 1;
            }

            if (index == k) {
                result = i;
                break;
            }
        }

        writer.write(result + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

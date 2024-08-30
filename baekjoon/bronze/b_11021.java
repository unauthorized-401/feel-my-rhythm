package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int sum = a + b;

            writer.write("Case #" + i + ": " + sum + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}

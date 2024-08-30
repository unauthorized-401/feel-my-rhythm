package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            writer.write(a + b + "\n");
        }
        reader.close();

        writer.flush();
        writer.close();
    }
}

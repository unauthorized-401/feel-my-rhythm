package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int sum = a + b;

            if (sum == 0) break;

            writer.write(sum + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

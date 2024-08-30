package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;
        String input;

        while ((input = reader.readLine()) != null) {
            token = new StringTokenizer(input, " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int sum = a + b;

            writer.write(sum + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            token = new StringTokenizer(reader.readLine(), " ");

            int count = Integer.parseInt(token.nextToken());
            String input = token.nextToken();

            String[] sliced = input.split("");
            for (int j = 0; j < sliced.length; j++) {
                for (int k = 0; k < count; k++) {
                    writer.write(sliced[j]);
                }
            }
            writer.write("\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int x = Integer.parseInt(token.nextToken());
        int y = Integer.parseInt(token.nextToken());
        int w = Integer.parseInt(token.nextToken());
        int h = Integer.parseInt(token.nextToken());

        int distance = Math.min(Math.min(x, y), Math.min((w-x), (h-y)));

        writer.write(distance + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

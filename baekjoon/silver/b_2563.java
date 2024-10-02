package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class b_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;

        int n = Integer.parseInt(reader.readLine());
        int[][] pappers = new int[101][101];
        int count = 0;

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(reader.readLine(), " ");

            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            for (int j = x; j < (x+10); j++) {
                for (int k = y; k < (y+10); k++) {
                    pappers[j][k] = 1;
                }
            }
        }

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (pappers[i][j] == 1) {
                    count += 1;
                }
            }
        }

        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

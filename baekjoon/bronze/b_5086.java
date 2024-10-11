package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;

        while (true) {
            token = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            if (a == 0) break;

            String result = "neither";

            if (a > b) {
                if (a % b == 0) {
                    result = "multiple";
                }
            } else {
                if (b % a == 0) {
                    result = "factor";
                }
            }

            writer.write(result + " \n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

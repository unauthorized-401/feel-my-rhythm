package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int value = n;

        String result = "";

        while (value != 0) {
            int quotient = value / b;
            int remainder = value % b;

            value = quotient;

            if (remainder > 9) {
                result += String.valueOf((char) (remainder + 55));
            } else {
                result += String.valueOf(remainder);
            }
        }

        String[] results = result.split("");

        for (int i = results.length-1; i >= 0; i--) {
            writer.write(results[i] + "");
        }
        writer.write("\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

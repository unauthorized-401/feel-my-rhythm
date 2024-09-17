package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        writer.write(token.countTokens() + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

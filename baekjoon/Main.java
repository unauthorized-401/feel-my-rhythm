package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;

        for (int i = 0; i < 3; i++) {
            token = new StringTokenizer(reader.readLine(), " ");
        }

        writer.write(distance + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

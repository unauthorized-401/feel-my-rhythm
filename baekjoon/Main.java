package baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while ((input = reader.readLine()) != null) {
            writer.write(input + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

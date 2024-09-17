package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        String[] first = token.nextToken().split("");
        String[] second = token.nextToken().split("");

        int firstNum = Integer.parseInt(first[2]) * 100 + Integer.parseInt(first[1]) * 10 + Integer.parseInt(first[0]);
        int secondNum = Integer.parseInt(second[2]) * 100 + Integer.parseInt(second[1]) * 10 + Integer.parseInt(second[0]);

        if (firstNum > secondNum) {
            writer.write(firstNum + "\n");
        } else {
            writer.write(secondNum + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

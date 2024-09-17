package baekjoon.bronze;

import java.io.*;
import java.util.Objects;

public class b_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split("");

        // 단어 길이가 1이면 스킵
        if (input.length == 0) {
            writer.write(1 + "\n");
        }

        int left = 0;
        int right = input.length-1;

        while (left < right) {
            if (Objects.equals(input[left], input[right])) {
                left += 1;
                right -= 1;
            } else {
                writer.write(0 + "\n");
                break;
            }
        }

        if (left == right || Objects.equals(input[left], input[right])) {
            writer.write(1 + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

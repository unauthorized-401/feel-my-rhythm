package baekjoon.bronze;

import java.io.*;
import java.util.Objects;

public class b_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // WA
        // 9번 + 2번
        // 10초 + 3초 = 13초
        String[][] dial = {{}, {}, {"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"},
                {"P", "Q", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y", "Z"}, {}};

        int sum = 0;

        String[] input = reader.readLine().split("");
        for (String target : input) {
            boolean flag = false;

            for (int j = 0; j < dial.length; j++) {
                String[] lists = dial[j];

                for (int k = 0; k < lists.length; k++) {
                    if (Objects.equals(target, lists[k])) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    sum += (j + 1);
                    break;
                }
            }
        }

        writer.write(sum + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

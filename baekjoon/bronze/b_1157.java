package baekjoon.bronze;

import java.io.*;

public class b_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().toLowerCase().split("");

        // a-z = 97-122
        int[] alphabets = new int[26];

        for (String input : inputs) {
            alphabets[input.charAt(0) - 97] += 1;
        }

        // 최대값 구하기
        int max = 0;
        int index = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                index = i;
            }
        }

        // 최대값이 몇 개인지
        int count = 0;
        for (int alphabet : alphabets) {
            if (alphabet == max) {
                count += 1;
            }
        }

        if (count > 1){
            writer.write("?" + "\n");
        } else {
            writer.write((char)(index+65) + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}

package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        String[] n = token.nextToken().split("");
        int b = Integer.parseInt(token.nextToken());

        int[] nums = new int[n.length];

        // A - Z : 10 - 35
        for (int i = 0; i < n.length; i++) {
            try {
                int target = Integer.parseInt(n[i]);
                nums[i] = target;
            } catch (Exception e) {
                int target2 = (int)n[i].charAt(0) - 55;
                nums[i] = target2;
            }
        }

        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            int index = nums.length-j-1;

            count += (int) (nums[j] * Math.pow(b, index));
        }

        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

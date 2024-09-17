package baekjoon.bronze;

import java.io.*;

public class b_10818 {
    public static void main(String[] args) throws IOException {
        //5
        //20 10 35 30 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] nums = reader.readLine().split(" ");

        int min = 1000001;
        int max = -1000001;

        for (String num : nums) {
            int target = Integer.parseInt(num);
            if (target >= max) max = target;
            if (target <= min) min = target;
        }

        writer.write(min + " " + max + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

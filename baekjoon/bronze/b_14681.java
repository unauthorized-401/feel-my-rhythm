package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int left = Integer.parseInt(reader.readLine());
        int right = Integer.parseInt(reader.readLine());

        if (left > 0 && right > 0) System.out.println(1);
        else if (left > 0 && right < 0) System.out.println(4);
        else if (left < 0 && right < 0) System.out.println(3);
        else if (left < 0 && right > 0) System.out.println(2);
    }
}

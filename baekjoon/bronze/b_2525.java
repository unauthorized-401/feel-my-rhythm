package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2525 {
    public static void main(String[] args) throws IOException {
        // 14 30
        // 20
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int hour = Integer.parseInt(token.nextToken());
        int minute = Integer.parseInt(token.nextToken());
        int duration = Integer.parseInt(reader.readLine());

        int total = minute + duration;

        // 분 처리
        if (total >= 60) {
            hour += total / 60;
            minute = total % 60;
        } else {
            minute = total;
        }

        // 시 처리
        if (hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}

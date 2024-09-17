package baekjoon.silver;

import java.io.*;
import java.util.Objects;

public class b_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        boolean isGroup = true;
        int count = 0;

        // 그룹단어 : 앞에서 나온 알파벳이 뒤에 또 나오면 안됨
        for (int i = 0; i < num; i++) {
            String[] inputs = reader.readLine().split("");

            if (inputs.length == 1 || inputs.length == 2) { // 문자열이 하나이거나 두개일 때
                count += 1;
                continue;
            }

            for (int j = 0; j < inputs.length; j++) {
                boolean flag = true;
                for (int k = j+1; k < inputs.length; k++) {
                    if (Objects.equals(inputs[j], inputs[k])) {
                        if (!flag) { // 중간에 다른 알파벳
                            isGroup = false;
                            break;
                        }
                    } else { // 계속 같은 알파벳
                        flag = false;
                    }
                }

                // 이미 그룹단어가 아니라고 판명되었을 경우
                if (!isGroup) {
                    break;
                }
            }

            if (isGroup) {
                count += 1;
            }

            // 그룹단어 여부 초기화
            isGroup = true;
        }

        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}

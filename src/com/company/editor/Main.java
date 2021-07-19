package com.company.editor;
// 입출력 관련 패키지


import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // stdin, stdout 관련 객체
        // Scanner를 써도 되지만 입출력이 비교적 너무 느리다!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String start = br.readLine();
        int point = start.length();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            // TODO: your solution
            String[] input = br.readLine().split(" ");
            String type = input[0];
            String val = "";
            if (input.length > 1) {
                val = input[1];
            }
            switch (type) {
                case "L":
                    if (point > 0) {
                        point--;
                    }
                    break;
                case "D":
                    if (point < start.length()) {
                        point++;
                    }
                    break;
                case "B":
                    if (start.length() < 1) {
                        break;
                    }
                    if (point < start.length()) {
                        if (point == 0) {
                            break;
                        }
                        start = start.substring(0, point - 1) + start.substring(point);
                    } else {
                        start = start.substring(0, point - 1);
                    }
                    point--;
                    break;
                case "P":
                    //   0   1   2
                    // p 1 p 2 p 3 p
                    // 0   1   2   3
                    // dmih / 11 / P z (11) 에서 오류
                    // start: ""
                    // point: 1
                    start = start.substring(0, point) + val + start.substring(point);
                    point++;
                    break;
            }
        }
        bw.write(start);
        // 버퍼에 남아 있는 문자열을 출력해서 버퍼를 비움
        bw.flush();
        // 스트림 닫아주기
        bw.close();
        br.close();
    }
}
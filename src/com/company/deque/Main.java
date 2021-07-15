package com.company.deque;
// 입출력 관련 패키지

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> integers = new ArrayDeque<>();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            // TODO: your solution
            String[] strings = br.readLine().split(" ");
            String type = strings[0];
            int val = -1;

            if (strings.length > 1) {
                val = Integer.parseInt(strings[1]);
            }

            switch (type) {
                case "push_front":
                    integers.addFirst(val);
                    break;
                case "push_back":
                    integers.addLast(val);
                    break;
                case "pop_front":
                    if (integers.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(integers.pollFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if (integers.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(integers.pollLast() + "\n");
                    }
                    break;
                case "size":
                    bw.write(integers.size() + "\n");
                    break;
                case "empty":
                    if (integers.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front":
                    if (integers.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(integers.peekFirst() + "\n");
                    }
                    break;
                case "back":
                    if (integers.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(integers.peekLast() + "\n");
                    }
                    break;
            }
        }

        // 버퍼 출력
        bw.flush();
        // 스트림 닫아주기
        bw.close();
        br.close();
    }
}
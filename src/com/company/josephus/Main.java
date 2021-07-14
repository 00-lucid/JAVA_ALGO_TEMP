package com.company.josephus;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> result = new LinkedList<>();
        String[] NK = br.readLine().split(" ");

        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int start = 0;
        List<Integer> alive = new ArrayList<>();

        // [1, 2, ..., N]
        for (int i = 1; i <= N; i ++) {
            alive.add(i);
        }

        while (!alive.isEmpty()) {
            // alive 큐가 빌 때까지 반복
            int expect = start + K;

            if (expect > N) {
                start = expect % N;
                if (start == 0) {
                    start = N;
                }
            } else {
                start = expect;
            }

            result.add(alive.remove(start - 1));
            N--;
            start--;
        }

        bw.write("<" + result.toString().substring(1, result.toString().length() - 1) + ">");
        bw.flush();
        bw.close();
        br.close();
    }
}
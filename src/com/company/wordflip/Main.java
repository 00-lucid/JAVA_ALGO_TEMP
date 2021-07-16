package com.company.wordflip;
// 입출력 관련 패키지

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> s = new Stack<>();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            String[] array = br.readLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                for (int o = 0; o < array[i].length(); o++) {
                    s.push(array[i].charAt(o));
                }
                int end = s.size();
                for (int p = 0; p < end; p++) {
                        bw.write(s.pop());
                }
                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
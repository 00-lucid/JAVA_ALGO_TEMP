package com.company;
// 입출력 관련 패키지
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 자료구조 패키지 (필요에 따라 여러 자료형 선택)
import java.util.Stack;

public class Temp {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // stdin, stdout 관련 객체
        // Scanner를 써도 되지만 입출력이 비교적 너무 느리다!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> s = new Stack<Integer>();

        // 모든 입력은 일단 문자열로 인식! (char와 다름!)
        // 1) 한줄에 정수 하나만 있는 경우 (입력의 크기, 테스트 케이스의 개수 등)
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            // TODO: your solution
        }

        // 2) 한줄에 여러 입력이 들어오는 경우
        // 보통 공백으로 구분됨 (뭐가됐든 구분자로 split!)
        // 문자열 여러 개니까 문자열 배열임 (ArrayList, Array, List 클래스와 다름!)
        String[] line = br.readLine().split(" ");
        // 배열은 `.length`로 길이를 알 수 있음
        for (int i = 0; i < line.length; i++) {
            // 각 요소에 따라 적절히 파싱 필요
            // 예시. 정수인 경우
            int num = Integer.parseInt(line[i]);
        }

        // 출력
        // 한 줄 또는 여러 줄
        // 개행 문자를 추가해준다.
        // 다른 방법도 있지만 이게 제일 빠름!
        // 개행 문자가 반복될 경우, 즉 한 번만 써도 되는 경우가 있지만 일단은 습관적으로 쓰는 걸로 하자!
        bw.write("test");

        // 버퍼에 남아 있는 문자열을 출력해서 버퍼를 비움
        bw.flush();

        // 스트림 닫아주기
        bw.close();
        br.close();
    }
}
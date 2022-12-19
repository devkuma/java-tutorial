package com.devkuma.algorithum.programing.acmicpc._15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(input.nextToken());
            m = Integer.parseInt(input.nextToken());
        }

        visit = new boolean[n];
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    /**
     * 깊이 우선 탐색(DFS, Depth-First Search)
     */
    static void dfs(int depth) {
        if (depth == m) {
            for (int value : arr) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;   // 해당 깊이를 index로 하여 i+1 값 저장
            dfs(depth + 1); // 다음 자식 노드 방문 위해 depth 1 증가시키며 재귀 호출
        }
    }
}
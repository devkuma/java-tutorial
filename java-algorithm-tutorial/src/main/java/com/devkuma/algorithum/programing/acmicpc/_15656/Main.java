package com.devkuma.algorithum.programing.acmicpc._15656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(input.nextToken());
            m = Integer.parseInt(input.nextToken());

            StringTokenizer inputNums = new StringTokenizer(br.readLine(), " ");

            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(inputNums.nextToken());
            }
            Arrays.sort(nums);

            dfs(0, new int[m]);
            System.out.println(sb);
        }
    }

    /**
     * 깊이 우선 탐색(DFS, Depth-First Search)
     */
    static void dfs(int depth, int[] selected) {
        if (depth == m) {
            for (int value : selected) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            selected[depth] = nums[i];
            dfs(depth + 1, selected);
        }
    }
}

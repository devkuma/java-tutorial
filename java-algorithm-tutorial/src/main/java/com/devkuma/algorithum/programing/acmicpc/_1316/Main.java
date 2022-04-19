package com.devkuma.algorithum.programing.acmicpc._1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            final int n = Integer.parseInt(br.readLine());

            int count = n; // 입력받은 횟수만큼 모두 그룹단어라고 가정하고 시작한다.
            for (int i = 0; i < n; i++) {
                String line = br.readLine();

                Set set = new HashSet<Character>();
                for (int j = 0; j < line.length(); j++) {

                    // 앞뒤가 같다면 넘어간다.
                    if (j != 0 && line.charAt(j) == line.charAt(j - 1)) {
                        continue;
                    }

                    char b = line.charAt(j);
                    if (set.contains(b)) {
                        count--; // 그룹단어라고 판단되어 갯수를 하나 뺀다.
                        break;
                    }
                    set.add(b);
                }
            }

            // 출력
            System.out.println(count);
        }
    }
}
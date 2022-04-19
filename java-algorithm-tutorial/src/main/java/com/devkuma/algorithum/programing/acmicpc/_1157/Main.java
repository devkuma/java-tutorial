package com.devkuma.algorithum.programing.acmicpc._1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            String input = br.readLine();

            Map<Character, Integer> alphabetCountMap = new HashMap<>();

            Set<Character> maxSet = new HashSet<>();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < input.length(); i++) {
                Character alphabet = Character.toUpperCase(input.charAt(i));

                int count;
                if (alphabetCountMap.containsKey(alphabet)) {
                    count = alphabetCountMap.get(alphabet) + 1;
                } else {
                    count = 0;
                }
                alphabetCountMap.put(alphabet, count);

                if (max < count) {
                    max = count;
                    maxSet.clear();
                    maxSet.add(alphabet);
                } else if (max == count) {
                    maxSet.add(alphabet);
                }
            }

            // 출력
            if (maxSet.size() > 1) {
                System.out.println("?");
            } else {
                System.out.println(maxSet.iterator().next());
            }
        }
    }
}
package com.devkuma.algorithum.programing.acmicpc._2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            String input = br.readLine();

            String[] chars = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            int count = 0;
            int fromIndex = 0;
            do {
                String searchChar = null;
                for (String ch : chars) {
                    if (input.startsWith(ch, fromIndex)) {
                        searchChar = ch;
                        break;
                    }
                }
                if (searchChar != null) {
                    fromIndex += searchChar.length();
                } else {
                    fromIndex++;
                }
                // 디버그용
                //System.out.println("searchChar=" + searchChar + ", fromIndex=" + fromIndex + ", input.length=" + input.length());
                count++;
            } while (input.length() > fromIndex);

            // 출력
            System.out.println(count);
        }
    }
}
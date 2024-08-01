package main.programmers.lssons181945;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 문자열 str이 주어집니다.
 * 문자열을 시계방향으로 90도 돌려서
 * 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 * (한 글자씩 한 줄 입력)
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String elementA = "";
        String a = sc.next();

        for(int i = 0; i < a.length(); i++) {
            elementA = String.valueOf(a.charAt(i));
            System.out.println(elementA);
        }
        sc.close();
    }
}
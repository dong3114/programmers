package main.programmers.lessons181946;

import java.util.Scanner;

/**
 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
 * 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
 * 제한사항
 * 1 ≤ str1, str2의 길이 ≤ 10
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sumA = "";
        while(sc.hasNextLine()) {
            String a = sc.nextLine();

            String[] arryA = a.split(" ");

            for(int i=0; i < arryA.length; i++) {
                String elementA = arryA[i];
                sumA += elementA;
            }
            System.out.println(sumA);
        }
    }
}